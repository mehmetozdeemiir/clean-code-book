package com.book.chapter3.c04.solution;

import com.book.chapter3.c04.Money;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(EmployeeRecord r) {
        super();
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }

    public void extraMethod() {

    }
}