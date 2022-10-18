package com.book.chapter3.c03;

import java.util.List;

public class TestDrive {

    // S OLID in S si
     /*
        FUNCTIONS SHOULD DO ONE THING. THEY SHOULD DO IT WELL. THEY SHOULD DO IT ONLY)
     */

    private List<Passenger> passengerList;
    String state;

    //metod ismi addPassenger ama aynı zamanda state güncellemeside yapıyor. State değiştirme durumunu ayrı bir metodda gerçekleştirilebilir.
    public void addPassenger(Passenger p){
        this.passengerList.add(p);
        if (passengerList.size() < 10)
            this.state = "Empty";
        else if (passengerList.size() < 30)
            this.state = "Half";
        else if (passengerList.size() >= 30)
            this.state = "Full";
    }
}
