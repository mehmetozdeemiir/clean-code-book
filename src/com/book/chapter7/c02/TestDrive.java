package com.book.chapter7.c02;

public class TestDrive {

    //try da yapıcağım işi denerim , catch de sorunla karşılaşırsam yakalarım finallyde kesinlikle bu işlem dönsün dediğim kısımı yazarım


     /*
        Checked exception atan bir yapıyı lambdalar ile kullanamayız.
        Runtime exception unchecked
     */

    static void stringConverter() throws RuntimeException {
        String test = null;
        test.toString();
    }


    public static void main(String[] args) {
        stringConverter();
        System.out.println("Hello");//patlar, try catch ile yönetilebilir
    }



}