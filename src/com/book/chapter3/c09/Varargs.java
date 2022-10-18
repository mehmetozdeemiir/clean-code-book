package com.book.chapter3.c09;

public class Varargs {

    //int... = buraya x sayıda int arguman verilebilir
    public static int sum(int a, int... args) {
        int sum = 0;
        for (int i : args)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,3,4,5,6,7)); //istediğimiz kadar değer verebiliriz ama null olması kosulunda hata vermiyor. int a parametre olarak eklersek bu sorunda ortadan kalkıyor.


    }

}