package com.book.chapter3.c10;

public class UserValidator{
    private Cryptographer cryptographer;

    //false
    public boolean checkPassword(String userName, String password){
        User user = UserGateway.findByName(userName);
        if(user != User.NULL){
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if("Valid Password".equals(phrase)){
                Session.initialize(); //burada initialize diye farklı bir iş yapan durum var bu metodun ismi bu olmamalı
                return true;
            }
        }
        return false;
    }

    //true
    public boolean checkPasswordAndInitializeSession(String userName, String password){
        User user = UserGateway.findByName(userName);
        if(user != User.NULL){
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if("Valid Password".equals(phrase)){
                Session.initialize();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        UserValidator us = new UserValidator();

        us.checkPasswordAndInitializeSession("Mehmet","Mehmet123");

    }

}