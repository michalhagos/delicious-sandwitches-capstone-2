package com.pluralsight.models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToppingTest {

    @Test
    public void getPrice_should_returnZero_forRegularTopping() {
        // arrange
        Topping topping = new Topping("lettuce", "regular", false);
        // act
        double price = topping.getPrice(8);
        // assert
        assertEquals(0.00, price);
    }
    @Test
    public void getPrice_should_returnZero_forSauce() {
        // arrange
        Topping sauce = new Topping("mayo", "sauce", false);
        // act
        double price = sauce.getPrice(8);
        // assert
        assertEquals(0.00, price);
    }
    @Test
    public void getPrice_should_returnOneDollar_forMeatOn4InchSandwich() {
        // arrange
        Topping meat = new Topping("ham", "meat", false);
        // act
        double price = meat.getPrice(4);
        // assert
        assertEquals(1.00, price);
    }
    @Test
    public void getPrice_should_returnFiftyCents_forExtraMeatOn4InchSandwich() {
        // arrange
        Topping extraMeat = new Topping("bacon", "meat", true);
        // act
        double price = extraMeat.getPrice(4);
        // assert
        assertEquals(0.50, price);
    }
    @Test
    public void getPrice_should_returnSeventyFiveCents_forCheeseOn4InchSandwich() {
        // arrange
        Topping cheese = new Topping("cheddar", "cheese", false);
        // act
        double price = cheese.getPrice(4);
        // assert
        assertEquals(0.75, price);
    }
    @Test
    public void getPrice_should_returnThirtyCents_forExtraCheeseOn4InchSandwich() {
        // arrange
        Topping extraCheese = new Topping("swiss", "cheese", true);

        // act
        double price = extraCheese.getPrice(4);

        // assert
        assertEquals(0.30, price);
    }

}