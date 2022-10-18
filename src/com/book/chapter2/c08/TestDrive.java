package com.book.chapter2.c08;

public class TestDrive {

    //good
    String addrZipCode;
    String addrFirstName;
    String addrLastName;
    String addrState;
    String addrStreet;


    //bad
    //adres bilgileri toplu olarak durduğunda bir bütün olarak adresi anımsatıyo olabilir fakat bu durumda state i addres ile ilgili olmayan bir class kullanırsa bize sıkıntı yapabilir onun için başına addr eklemekte fayda var.
    String zipCode;
    String firstName;
    String lastName;
    String state;
    String street;

    public void main(String[] args) {



    }
}
