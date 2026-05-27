package com.pluralsight.models;

// BLTSandwich class extends Sandwich
// all ingredients are preloaded in the constructor
public class BLTSandwich extends Sandwich {
    // the constructor calls the Sandwich parent constructor using super
    public BLTSandwich() {
        super("white", 8, true);
        // add the preloaded ingredients
        // bacon is a meat topping so it costs extra
        addMeat(new Topping("bacon", "meat", false));
        // cheddar is a cheese topping so it costs extra
        addCheese(new Topping("cheddar", "cheese", false));
        // lettuce and tomato are regular toppings so they are free
        addTopping(new Topping("lettuce", "regular", false));
        addTopping(new Topping("tomato", "regular", false));
        // ranch is a sauce so it is free
        addSauce(new Topping("ranch", "sauce", false));
    }
}
