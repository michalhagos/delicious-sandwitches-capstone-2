package com.pluralsight.models;

import java.util.ArrayList;

public class Sandwich {
        // the type of bread chosen by the customer
        private String bread;
        // the size of the sandwich in inches
        private int size;
        // whether the customer wants the sandwich toasted
        private boolean toasted;
        // the list of all toppings on this sandwich
        private ArrayList<Topping> toppings;

        // the starting price of the sandwich based on size only.topping prices get added on top of this
        private double basePrice;

    // constructor sets bread size and toasted. base price is  calculated from the size
    public Sandwich(String bread, int size, boolean toasted) {
        this.bread = bread;
        this.size = size;
        this.toasted = toasted;

        // initializing the toppings list so it is ready to hold toppings
        this.toppings = new ArrayList<>();

        // set the base price based on the size chosen by the customer
        if (size == 4) {
            this.basePrice = 5.50;
        } else if (size == 8) {
            this.basePrice = 7.00;
        } else if (size == 12) {
            this.basePrice = 8.50;
        }
    }


    }

