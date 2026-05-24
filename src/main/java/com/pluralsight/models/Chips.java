package com.pluralsight.models;

public class Chips {
    // the type of chips chosen by customer
    private String type;
    // chips are always a flat price of $1.50
    private double price = 1.50;
    // the constructor sets the chip type. price is always $1.50 so no need to calculate it
    public Chips(String type) {
        this.type = type;
    }
    // returns the type of chips
    public String getType() {
        return type;
    }
    // returns the price of the chips. always $1.50
    public double getPrice() {
        return price;
    }
    // updates the type of chips
    public void setType(String type) {
        this.type = type;
    }

}
