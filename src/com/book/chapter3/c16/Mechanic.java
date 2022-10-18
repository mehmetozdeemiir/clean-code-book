package com.book.chapter3.c16;

//true
//her pakette kullanılabilecekse util sınıflarda olusturulabilir(HelpUtil) static isaretlenerek.
public class Mechanic {

    public void serviceBus() {
        System.out.println("Servicing bus now");
        washVehicle();
    }
    public void serviceCar() {
        System.out.println("Servicing car now");
        washVehicle();
    }
    public void washVehicle() {
        //Process washing
    }

}