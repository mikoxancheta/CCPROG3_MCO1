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
     * within the supermarket.
     *
     * @param supermarket The supermarket to populate
     */
    private static void initializeProductsAndDisplays(Supermarket supermarket) {
        Product[] fruits = {
            new Product("Fruit", "Apple", 25.50),
            new Product("Fruit", "Banana", 15.00),
            new Product("Fruit", "Mango", 30.00)
        };

        Product[] chicken = {
            new Product("Chicken", "Chicken Breast", 150.00),
            new Product("Chicken", "Whole Chicken", 220.00),
            new Product("Chicken", "Chicken Thigh", 170.00)
        };

        Product[] beef = {
            new Product("Beef", "Ribeye Steak", 350.00),
            new Product("Beef", "Ground Beef", 280.00),
            new Product("Beef", "Beef Tapa", 200.00)
        };

        Product[] seafood = {
            new Product("Seafood", "Shrimp", 400.00),
            new Product("Seafood", "Salmon", 450.00),
            new Product("Seafood", "Squid", 250.00)
        };

        Product[] cereal = {
            new Product("Cereal", "Java Cereal", 90.00),
            new Product("Cereal", "OOPsie Oaties", 85.00),
            new Product("Cereal", "Barley Bytes", 80.00)
        };

        Product[] noodles = {
            new Product("Noodles", "Instant Ramen", 50.00),
            new Product("Noodles", "Egg Noodles", 65.00),
            new Product("Noodles", "Rice Noodles", 60.00)
        };

        Product[] snacks = {
            new Product("Snacks", "Choco Chips", 45.00),
            new Product("Snacks", "Potato Crisps", 50.00),
            new Product("Snacks", "Fruit Gummies", 40.00)
        };

        Product[] cannedGoods = {
            new Product("CannedGoods", "Canned Tuna", 55.00),
            new Product("CannedGoods", "Canned Corn", 50.00),
            new Product("CannedGoods", "Canned Beans", 60.00)
        };

        Product[] condiments = {
            new Product("Condiments", "Ketchup", 35.00),
            new Product("Condiments", "Soy Sauce", 40.00),
            new Product("Condiments", "Mustard", 30.00)
        };

        Product[] softdrinks = {
            new Product("Softdrink", "Cola", 45.00),
            new Product("Softdrink", "Lemonade", 40.00),
            new Product("Softdrink", "Orange Soda", 42.00)
        };

        Product[] juice = {
            new Product("Juice", "Apple Juice", 50.00),
            new Product("Juice", "Mango Juice", 55.00),
            new Product("Juice", "Orange Juice", 48.00)
        };

        Product[] alcohol = {
            new Product("Alcohol", "Beer", 120.00),
            new Product("Alcohol", "Whiskey", 450.00),
            new Product("Alcohol", "Vodka", 400.00)
        };

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
