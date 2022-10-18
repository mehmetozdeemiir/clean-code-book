package com.book.chapter5.c03;

public class TestDrive{
    int lineCount;
    int totalChars;

    private void measureLine(String line){
        lineCount++;
        int lineSize = line.length();// = iki tarafına boşluk koymak daha okunabilir.
        totalChars += lineSize;//aynı şekilde
    }
}