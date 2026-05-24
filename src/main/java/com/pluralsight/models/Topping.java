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


}
