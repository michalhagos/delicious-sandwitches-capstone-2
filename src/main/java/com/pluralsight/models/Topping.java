package com.pluralsight.models;

public class Topping {
    // the name of the topping
    private String name;
    // the type of topping
    private String type;
    // whether the customer wants extra of this topping
    private boolean extra;
    // constructor sets all three fields when a new topping is created
    public Topping(String name, String type, boolean extra) {
        this.name = name;
        this.type = type;
        this.extra = extra;
    }
    // returns the name of the topping
    public String getName() {
        return name;
    }

    // returns the type of the topping
    public String getType() {
        return type;
    }

    // returns whether this topping is extra
    public boolean isExtra() {
        return extra;
    }
    // updates the name of the topping
    public void setName(String name) {
        this.name = name;
    }

    // updates the type of the topping
    public void setType(String type) {
        this.type = type;
    }

    // updates whether this topping is extra
    public void setExtra(boolean extra) {
        this.extra = extra;
    }
    // the getPrice method calculates the price of this topping based on the sandwich size
    public double getPrice(int size) {

        // regular toppings and sauces are always free so returns 0
        if (type.equalsIgnoreCase("regular") || type.equalsIgnoreCase("sauce")) {
            return 0.00;
        }

        // meat pricing based on sandwich size
        if (type.equalsIgnoreCase("meat")) {
            if (extra) {
                // extra meat pricing
                if (size == 4) return 0.50;
                if (size == 8) return 1.00;
                if (size == 12) return 1.50;
            } else {
                // regular meat pricing
                if (size == 4) return 1.00;
                if (size == 8) return 2.00;
                if (size == 12) return 3.00;
            }
        }

        // cheese pricing based on sandwich size
        if (type.equalsIgnoreCase("cheese")) {
            if (extra) {
                // extra cheese pricing
                if (size == 4) return 0.30;
                if (size == 8) return 0.60;
                if (size == 12) return 0.90;
            } else {
                // regular cheese pricing
                if (size == 4) return 0.75;
                if (size == 8) return 1.50;
                if (size == 12) return 2.25;
            }
        }

        // default return 0 means if nothing matched
        return 0.00;
    }
    // returns a readable string of the topping
    @Override
    public String toString() {
        if (extra) {
            return name + " (extra)";
        }
        return name;
    }
}
