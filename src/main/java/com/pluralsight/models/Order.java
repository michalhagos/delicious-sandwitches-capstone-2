package com.pluralsight.models;

import java.util.ArrayList;

public class Order {
    // the list of all sandwiches in this order
    private ArrayList<Sandwich> sandwiches;
    // the list of all drinks in this order
    private ArrayList<Drink> drinks;
    // the list of all chips in this order
    private ArrayList<Chips> chips;
    // the constructor initializes all three empty lists.
    // when a new order is created it starts with nothing in it
    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }
    // returns the list of all sandwiches in the order
    public ArrayList<Sandwich> getSandwiches() {
        return sandwiches;
    }
    // returns the list of all drinks in the order
    public ArrayList<Drink> getDrinks() {
        return drinks;
    }
    // returns the list of all chips in the order
    public ArrayList<Chips> getChips() {
        return chips;
    }

    // adds a sandwich to the order
    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }
    // adds a drink to the order
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
    // adds chips to the order
    public void addChips(Chips chips) {
        this.chips.add(chips);
    }

}
