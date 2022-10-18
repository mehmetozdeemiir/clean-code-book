package com.book.chapter5.c04;

public class TestDrive {

    //bad
    private String                    exampleZeroOne;
    private String                    exampleZeroTwo;
    private LongNameClassForSupport   exampleZeroThree;

    //bad
    public TestDrive(String exampleZeroOne, String exampleZeroTwo, LongNameClassForSupport exampleZeroThree){
        this.exampleZeroOne =   exampleZeroOne;
        this.exampleZeroTwo =   exampleZeroTwo;
        this.exampleZeroThree = exampleZeroThree;
    }
}
