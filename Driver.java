import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Driver class runs the console-based simulation of the supermarket.
 * It allows the user to create a shopper, move them around using WASD keys,
 * change direction with IJKL, and interact using the Space key.
 * 
 * It also initializes all product types with at least 3 unique products each
 * and stocks them into the appropriate displays.
 */
public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean restart;

        do {
            Supermarket supermarket = new Supermarket();
            initializeProductsAndDisplays(supermarket);

            System.out.println("=== Welcome to the Supermarket Simulator ===\n");

            System.out.print("Enter shopper's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter shopper's age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            supermarket.addShopper(name, age);

            System.out.println("\nYou can now explore the supermarket.");
            System.out.println("Use W/A/S/D to move, I/J/K/L to face, SPACE to interact, and Q to quit.\n");

            String command;
            do {
                System.out.print("Enter command: ");
                command = scanner.nextLine().trim().toUpperCase();

                switch (command) {
                    case "W":
                        supermarket.moveShopper("up");
                        break;
                    case "S":
                        supermarket.moveShopper("down");
                        break;
                    case "A":
                        supermarket.moveShopper("left");
                        break;
                    case "D":
                        supermarket.moveShopper("right");
                        break;
                    case "I":
                        supermarket.getShopper().face("up");
                        break;
                    case "K":
                        supermarket.getShopper().face("down");
                        break;
                    case "J":
                        supermarket.getShopper().face("left");
                        break;
                    case "L":
                        supermarket.getShopper().face("right");
                        break;
                    case " ":
                        supermarket.interact();
                        break;
                    case "Q":
                        System.out.println("\nYou chose to leave the supermarket.");
                        break;
                    default:
                        System.out.println("Invalid input! Use W/A/S/D for movement, I/J/K/L for facing, SPACE to interact, Q to quit.");
                        break;
                }

            } while (!command.equals("Q"));

            System.out.print("\nDo you want to restart the simulation? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();
            restart = choice.equals("yes");

            if (!restart) {
                System.out.println("\nSimulation ended. Thank you for visiting the Supermarket Simulator!");
            }

        } while (restart);

        scanner.close();
    }

    /**
     * Initializes products for all types and stocks them into proper displays
     * within the supermarket. Each product is assigned a unique serial number manually.
     *
     * @param supermarket The supermarket to populate
     */
    private static void initializeProductsAndDisplays(Supermarket supermarket) {
        Product[] fruits = {
            new Product("Fruit", "Apple", "FRU00001", 25.50),
            new Product("Fruit", "Banana", "FRU00002", 15.00),
            new Product("Fruit", "Mango", "FRU00003", 30.00)
        };

        Product[] chicken = {
            new Product("Chicken", "Chicken Breast", "CHK00001", 150.00),
            new Product("Chicken", "Whole Chicken", "CHK00002", 220.00),
            new Product("Chicken", "Chicken Thigh", "CHK00003", 170.00)
        };

        Product[] beef = {
            new Product("Beef", "Ribeye Steak", "BEE00001", 350.00),
            new Product("Beef", "Ground Beef", "BEE00002", 280.00),
            new Product("Beef", "Beef Tapa", "BEE00003", 200.00)
        };

        Product[] seafood = {
            new Product("Seafood", "Shrimp", "SEA00001", 400.00),
            new Product("Seafood", "Salmon", "SEA00002", 450.00),
            new Product("Seafood", "Squid", "SEA00003", 250.00)
        };

        Product[] cereal = {
            new Product("Cereal", "Java Cereal", "CER00001", 90.00),
            new Product("Cereal", "OOPsie Oaties", "CER00002", 85.00),
            new Product("Cereal", "Barley Bytes", "CER00003", 80.00)
        };

        Product[] noodles = {
            new Product("Noodles", "Instant Ramen", "NOD00001", 50.00),
            new Product("Noodles", "Egg Noodles", "NOD00002", 65.00),
            new Product("Noodles", "Rice Noodles", "NOD00003", 60.00)
        };

        Product[] snacks = {
            new Product("Snacks", "Choco Chips", "SNA00001", 45.00),
            new Product("Snacks", "Potato Crisps", "SNA00002", 50.00),
            new Product("Snacks", "Fruit Gummies", "SNA00003", 40.00)
        };

        Product[] cannedGoods = {
            new Product("CannedGoods", "Canned Tuna", "CAN00001", 55.00),
            new Product("CannedGoods", "Canned Corn", "CAN00002", 50.00),
            new Product("CannedGoods", "Canned Beans", "CAN00003", 60.00)
        };

        Product[] condiments = {
            new Product("Condiments", "Ketchup", "CON00001", 35.00),
            new Product("Condiments", "Soy Sauce", "CON00002", 40.00),
            new Product("Condiments", "Mustard", "CON00003", 30.00)
        };

        Product[] softdrinks = {
            new Product("Softdrink", "Cola", "SFD00001", 45.00),
            new Product("Softdrink", "Lemonade", "SFD00002", 40.00),
            new Product("Softdrink", "Orange Soda", "SFD00003", 42.00)
        };

        Product[] juice = {
            new Product("Juice", "Apple Juice", "JUI00001", 50.00),
            new Product("Juice", "Mango Juice", "JUI00002", 55.00),
            new Product("Juice", "Orange Juice", "JUI00003", 48.00)
        };

        Product[] alcohol = {
            new Product("Alcohol", "Beer", "ALC00001", 120.00),
            new Product("Alcohol", "Whiskey", "ALC00002", 450.00),
            new Product("Alcohol", "Vodka", "ALC00003", 400.00)
        };

        // Create displays with allowed product types
        Display fruitDisplay = new Display(new Position(1, 1), new Address("A1"), 10, "Fruit");
        Display chickenDisplay = new Display(new Position(2, 1), new Address("A2"), 10, "Chicken");
        Display beefDisplay = new Display(new Position(3, 1), new Address("A3"), 10, "Beef");
        Display seafoodDisplay = new Display(new Position(4, 1), new Address("A4"), 10, "Seafood");
        Display cerealDisplay = new Display(new Position(5, 1), new Address("B1"), 10, "Cereal");
        Display noodlesDisplay = new Display(new Position(6, 1), new Address("B2"), 10, "Noodles");
        Display snacksDisplay = new Display(new Position(7, 1), new Address("B3"), 10, "Snacks");
        Display cannedGoodsDisplay = new Display(new Position(8, 1), new Address("B4"), 10, "CannedGoods");
        Display condimentsDisplay = new Display(new Position(9, 1), new Address("C1"), 10, "Condiments");
        Display softdrinkDisplay = new Display(new Position(10, 1), new Address("C2"), 10, "Softdrink");
        Display juiceDisplay = new Display(new Position(11, 1), new Address("C3"), 10, "Juice");
        Display alcoholDisplay = new Display(new Position(12, 1), new Address("C4"), 10, "Alcohol");

        // Assign products randomly to displays
        assignProductsRandomly(fruitDisplay, fruits);
        assignProductsRandomly(chickenDisplay, chicken);
        assignProductsRandomly(beefDisplay, beef);
        assignProductsRandomly(seafoodDisplay, seafood);
        assignProductsRandomly(cerealDisplay, cereal);
        assignProductsRandomly(noodlesDisplay, noodles);
        assignProductsRandomly(snacksDisplay, snacks);
        assignProductsRandomly(cannedGoodsDisplay, cannedGoods);
        assignProductsRandomly(condimentsDisplay, condiments);
        assignProductsRandomly(softdrinkDisplay, softdrinks);
        assignProductsRandomly(juiceDisplay, juice);
        assignProductsRandomly(alcoholDisplay, alcohol);

        // Add displays to supermarket
        supermarket.addDisplay(fruitDisplay);
        supermarket.addDisplay(chickenDisplay);
        supermarket.addDisplay(beefDisplay);
        supermarket.addDisplay(seafoodDisplay);
        supermarket.addDisplay(cerealDisplay);
        supermarket.addDisplay(noodlesDisplay);
        supermarket.addDisplay(snacksDisplay);
        supermarket.addDisplay(cannedGoodsDisplay);
        supermarket.addDisplay(condimentsDisplay);
        supermarket.addDisplay(softdrinkDisplay);
        supermarket.addDisplay(juiceDisplay);
        supermarket.addDisplay(alcoholDisplay);
    }

    /**
     * Helper method to shuffle and add products to a display
     *
     * @param display  The display to stock products
     * @param products Array of products to assign
     */
    private static void assignProductsRandomly(Display display, Product[] products) {
        List<Product> shuffled = new ArrayList<>();
        Collections.addAll(shuffled, products);
        Collections.shuffle(shuffled);
        for (Product p : shuffled) {
            display.addProduct(p);
        }
    }
}
