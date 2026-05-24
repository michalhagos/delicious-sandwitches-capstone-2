package com.pluralsight.models;

public class Drink {
    // the size of the drink chosen by the customer. small medium or large
    private String size;
    // the flavor of the drink chosen by the customer
    private String flavor;
    // the price of the drink based on size. small $2.00 medium $2.50 large $3.00
    private double price;

    // constructor sets size and flavor. price is  set from the size chosen
    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
        // update the price based on the size chosen by the customer
        if (size.equalsIgnoreCase("small")) {
            this.price = 2.00;
        } else if (size.equalsIgnoreCase("medium")) {
            this.price = 2.50;
        } else if (size.equalsIgnoreCase("large")) {
            this.price = 3.00;
        }
    }
}
