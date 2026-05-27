# DELICIOUS-SANDWICH Shop

A console based Java application that simulates a custom sandwich shop ordering system. Customers can build their own sandwiches, choose drinks and chips, and generate a receipt at checkout.

---

## How to Run
1. Clone the repository to your computer
2. Open the project in IntelliJ
3. Find `Application.java` in the `com.pluralsight` package
4. Click the green play button
5. The menu will appear and you can start ordering

---

## Menus

**Home Screen**
```
1) New Order
0) Exit
```

**Order Screen**
```
1) Add Sandwich
2) Add Drink
3) Add Chips
4) Checkout
5) Add Signature Sandwich
0) Cancel Order
```

---

## Building a Sandwich
- Choose bread — white, wheat, rye, or wrap
- Choose size — 4", 8", or 12"
- Choose if toasted
- Add meats, cheeses, toppings, and sauces
- Type `done` when finished with each category

---

## Signature Sandwiches
| Name | Details |
|------|---------|
| BLT | 8" white, bacon, cheddar, lettuce, tomato, ranch, toasted |
| Philly Cheese Steak | 8" white, steak, american, peppers, mayo, toasted |

---

## Pricing

**Sandwich Base Prices**
| Size | Price |
|------|-------|
| 4"   | $5.50 |
| 8"   | $7.00 |
| 12"  | $8.50 |

**Meat Prices**
| Size | Regular | Extra |
|------|---------|-------|
| 4"   | $1.00   | $0.50 |
| 8"   | $2.00   | $1.00 |
| 12"  | $3.00   | $1.50 |

**Cheese Prices**
| Size | Regular | Extra |
|------|---------|-------|
| 4"   | $0.75   | $0.30 |
| 8"   | $1.50   | $0.60 |
| 12"  | $2.25   | $0.90 |

**Other Items**
| Item | Price |
|------|-------|
| Small Drink | $2.00 |
| Medium Drink | $2.50 |
| Large Drink | $3.00 |
| Chips | $1.50 |

> Regular toppings and sauces are always free

---

## Receipt
Every completed order is saved to `src/main/resources/receipts/` with the filename format `yyyyMMdd-HHmmss.txt`

Example: `20230329-121523.txt`

---

## Classes
| Class | Purpose |
|-------|---------|
| `Application` | Starts the app |
| `UserInterface` | Handles all menus and user input |
| `Sandwich` | Builds a custom sandwich with toppings and price |
| `Topping` | Represents one topping with pricing logic |
| `Drink` | Represents a drink with size and flavor |
| `Chips` | Represents chips at flat $1.50 |
| `Order` | Holds all items and calculates total |
| `ReceiptWriter` | Saves the order to a receipt file |
| `BLTSandwich` | Pre-built signature BLT sandwich |
| `PhillyCheeseSteak` | Pre-built signature Philly sandwich |
| `Priceable` | Interface implemented by Sandwich, Drink, and Chips |

---

## Technologies
- Java
- Maven
- JUnit 5
- IntelliJ IDEA

---

## Author
Built as part of the Pluralsight Java Academy Capstone 2 project by Michal Hagos.
