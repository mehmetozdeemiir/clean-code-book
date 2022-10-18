package com.book.chapter3.c04;

public class Payroll {
    // Single Responsebility?, OpenClose?
    // Değiştirmek için 1'den fazla neden var! (Employee tipi + payCalculations) //değiştirmeden geliştirilmesi zor open closed a uymuyor bu kötü bir örnek
    public Money calculatePay(Employee e) {
        switch (e) {
            case PARTTIME:
                return partTimePay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                return null;
        }
    }

    // Java Optional.. Do not return null! -- Code contract<x,e>
    private Money calculateSalariedPay(Employee e) {
        return null;
    }

    private Money calculateHourlyPay(Employee e) {
        return null;
    }

    private Money partTimePay(Employee e) {
        /*
         */
        return null;
    }
}
