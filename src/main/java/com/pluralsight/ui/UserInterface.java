package com.pluralsight.ui;
import com.pluralsight.models.Chips;
import com.pluralsight.models.Drink;
import com.pluralsight.models.Order;
import com.pluralsight.models.Sandwich;
import com.pluralsight.models.Topping;
import com.pluralsight.util.ReceiptWriter;
import java.util.Scanner;

public class UserInterface {
    // scanner reads all user input throughout the entire app
    private Scanner scanner;

    // constructor creates the scanner when UserInterface is created
    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }
    // starts the application and runs the home screen loop
// keeps running until the user chooses to exit
    public void display() {
        boolean running = true;

        while (running) {
            // show the home screen menu
            System.out.println("\n===================================");
            System.out.println("   Welcome to DELICIOUS-SANDWICHES!");
            System.out.println("==================================== ");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    // start a brand-new order
                    processNewOrder();
                    break;
                case "0":
                    // exit the application
                    running = false;
                    System.out.println("\nThank you for visiting DELICIOUS-SANDWICHES! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    // the processNewOrder method creates a new order and shows the order screen
// keeps running until the user checks out or cancels
    private void processNewOrder() {
        // create a fresh empty order
        Order order = new Order();
        boolean ordering = true;

        while (ordering) {
            // show the order screen menu
            System.out.println("\n===== Order Screen =====");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    processAddSandwich(order);
                    break;
                case "2":
                  //  processAddDrink(order);
                    break;
                case "3":
                   // processAddChips(order);
                    break;
                case "4":
                    // go to check out and stop the loop if confirmed
                  //  ordering = !processCheckout(order);
                    break;
                case "0":
                    // cancel the order and go back to home screen
                    ordering = false;
                    System.out.println("Order cancelled. Going back to home screen.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    // processAddSandwich method walks the user through building a custom sandwich step by step
    // then adds the finished sandwich to the order
    private void processAddSandwich(Order order) {
        System.out.println("\n--- Build Your Sandwich ---");

        // ask for bread type
        System.out.println("Bread types: white, wheat, rye, wrap");
        System.out.print("Choose your bread: ");
        String bread = scanner.nextLine().trim();

        // ask for size
        System.out.print("Choose your size (4, 8, or 12): ");
        int size = Integer.parseInt(scanner.nextLine().trim());

        // ask if toasted
        System.out.print("Would you like it toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().trim().equalsIgnoreCase("yes");

        // create the sandwich with bread size and toasted
        Sandwich sandwich = new Sandwich(bread, size, toasted);

        // ask for meats
        System.out.println("\nMeats available: steak, ham, salami, roast beef, chicken, bacon");
        System.out.println("Type a meat and press enter. Type done when finished.");
        while (true) {
            System.out.print("Add meat (or done): ");
            String meat = scanner.nextLine().trim();
            if (meat.equalsIgnoreCase("done")) break;

            System.out.print("Would you like extra " + meat + "? (yes/no): ");
            boolean extra = scanner.nextLine().trim().equalsIgnoreCase("yes");
            sandwich.addMeat(new Topping(meat, "meat", extra));
        }

        // ask for cheeses
        System.out.println("\nCheeses available: american, provolone, cheddar, swiss");
        System.out.println("Type a cheese and press enter. Type done when finished.");
        while (true) {
            System.out.print("Add cheese (or done): ");
            String cheese = scanner.nextLine().trim();
            if (cheese.equalsIgnoreCase("done")) break;

            System.out.print("Would you like extra " + cheese + "? (yes/no): ");
            boolean extra = scanner.nextLine().trim().equalsIgnoreCase("yes");
            sandwich.addCheese(new Topping(cheese, "cheese", extra));
        }

        // ask for regular toppings
        System.out.println("\nToppings available: lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms");
        System.out.println("Type a topping and press enter. Type done when finished.");
        while (true) {
            System.out.print("Add topping (or done): ");
            String topping = scanner.nextLine().trim();
            if (topping.equalsIgnoreCase("done")) break;
            sandwich.addTopping(new Topping(topping, "regular", false));
        }

        // ask for sauces
        System.out.println("\nSauces available: mayo, mustard, ketchup, ranch, thousand island, vinaigrette");
        System.out.println("Type a sauce and press enter. Type done when finished.");
        while (true) {
            System.out.print("Add sauce (or done): ");
            String sauce = scanner.nextLine().trim();
            if (sauce.equalsIgnoreCase("done")) break;
            sandwich.addSauce(new Topping(sauce, "sauce", false));
        }

        // add the completed sandwich to the order
        order.addSandwich(sandwich);
        System.out.println("\nSandwich added to your order!");
        System.out.println(sandwich.getSummary());
    }
}
