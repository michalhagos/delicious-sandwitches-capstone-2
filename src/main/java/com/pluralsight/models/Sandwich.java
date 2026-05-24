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
    // returns the bread type of the sandwich
    public String getBread() {
        return bread;
    }

    // returns the size of the sandwich in inches
    public int getSize() {
        return size;
    }

    // returns whether the sandwich is toasted
    public boolean isToasted() {
        return toasted;
    }

    // returns the list of all toppings on this sandwich
    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    // returns the base price before toppings are added
    public double getBasePrice() {
        return basePrice;
    }
    // updates the bread type
    public void setBread(String bread) {
        this.bread = bread;
    }

    // updates the size
    public void setSize(int size) {
        this.size = size;
    }

    // updates whether the sandwich is toasted
    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
    // adds a meat topping to the sandwich.meat toppings cost extra money based on size
    public void addMeat(Topping meat) {
        toppings.add(meat);
    }
    // adds a cheese topping to the sandwich. cheese toppings will cost extra money based on size
    public void addCheese(Topping cheese) {
        toppings.add(cheese);
    }



    }

