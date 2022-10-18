package com.book.chapter2.c01;

import java.util.ArrayList;
import java.util.List;

//isimlendirmelerin çoğu zaman yorum satırına ihtiyaç duymaması gerekir

public class BadNaming {

    int d; // elapsed time in day


    //bad naming
    public List<int[]> getThem(int[][] theList) {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
}
