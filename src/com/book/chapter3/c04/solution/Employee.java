package com.book.chapter3.c04.solution;

import com.book.chapter3.c04.Money;
//isim seçmek için zaman harcamaktan korkmayın
public abstract class Employee {
    public abstract boolean isPayday(); //isimlendirmeler nice
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);
}
