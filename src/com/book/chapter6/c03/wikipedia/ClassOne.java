package com.book.chapter6.c03.wikipedia;

public class ClassOne {

    private ClassTwo classTwo;



    public void method1() {//true
        method2();
    }
    public void method2() {

    }


    public void method3(ClassTwo classTwo) {//true m's parameters
        classTwo.method4();
    }


    public void method4(){
        ClassTwo classTwo = new ClassTwo();// any object created/instantited within m
        classTwo.method4();
    }


    public void method5(){
        classTwo = new ClassTwo();//O's direct component objects
        classTwo.method4();
    }

}