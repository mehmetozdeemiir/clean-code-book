package com.book.chapter7.c03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//metodlara null geçilmesin parametre olarak

public class TestDrive {

    private static final List<Cheese> cheesesInStock = new ArrayList<>();

    /**
     * @return a list containing all of the cheeses in the shop,
     *     or null if no cheeses are available for purchase.
     */
    public static List<Cheese> getInStockCheeses() { // Look main method
        return cheesesInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheesesInStock); //null yerıne Collectios.emptylist donulebilir.
    }

    public static void main(String[] args){

        List<Cheese> cheeses = getInStockCheeses();

        if (cheeses != null && cheeses.contains(Cheese.CHEDDAR)) { // You need to check null
            System.out.println("We have cheese in stock");
        }

    }

}