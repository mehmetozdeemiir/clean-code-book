package com.book.chapter2.c05;

public class BadExample {

    private String m_dsc; // The textual description

    void setName(String name) {
        m_dsc = name;
    }


    int s;
    int[] t;
    {
        for (int j=0; j<34; j++) {
            s += (t[j]*4)/5;
        }
    }
}
