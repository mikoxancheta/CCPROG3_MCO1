import java.util.Scanner;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * The Supermarket class represents the main supermarket environment containing
 * one or more floors and a shopper. For MCO1, only a single floor is required.
 * This class manages the overall flow of the simulation, including starting
 * the program and handling shopper movement and interactions.
 */
public class Supermarket {

    /** The list of floors in the supermarket. */
    private Floor[] floors;

    /** The active shopper currently in the supermarket. */
    private Shopper shopper;

    /**
     * Constructs a Supermarket with one floor for MCO1.
     */
    public Supermarket() {
        // For MCO1, the supermarket starts with a single floor
        floors = new Floor[1];
        floors[0] = new Floor();  // Initialize the first floor
        shopper = null;           // Shopper will be initialized later
    }

    /**
     * Starts the supermarket simulation. Creates a shopper and handles
     * console-based navigation (WASD for movement, IJKL for facing direction,
     * and Space for interactions).
     */
    public void startSimulation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Welcome to the Supermarket Simulator ===");

        // Initialize shopper
        System.out.print("Enter shopper's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter shopper's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        shopper = new Shopper(name, age, new Position(0, 0));

        System.out.println("\nHello, " + shopper.getName() + "! You can now explore the supermarket.");
        System.out.println("Use W/A/S/D to move, I/J/K/L to change direction, and SPACE to interact.");
        System.out.println("Type 'Q' anytime to quit.\n");

        String command;
        do {
            System.out.print("Enter command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "W":
                    shopper.move("up");
                    break;
                case "S":
                    shopper.move("down");
                    break;
                case "A":
                    shopper.move("left");
                    break;
                case "D":
                    shopper.move("right");
                    break;
                case "I":
                    shopper.face("up");
                    break;
                case "K":
                    shopper.face("down");
                    break;
                case "J":
                    shopper.face("left");
                    break;
                case "L":
                    shopper.face("right");
                    break;
                case " ":
                    // For MCO1, interaction is limited and may be simulated
                    System.out.println(shopper.getName() + " interacts with the nearby amenity (if any).");
                    break;
                case "Q":
                    System.out.println("\nExiting the supermarket. Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid input! Use W/A/S/D for movement, I/J/K/L for direction, SPACE to interact, Q to quit.");
                    break;
            }

        } while (!command.equals("Q"));

        scanner.close();
    }

    /**
     * Moves the shopper in the specified direction. This method may be called
     * by other classes or methods to simulate shopper navigation.
     *
     * @param direction The direction to move ("up", "down", "left", or "right").
     */
    public void moveShopper(String direction) {
        if (shopper != null) {
            shopper.move(direction);
        } else {
            System.out.println("No shopper in the supermarket.");
        }
    }

    /**
     * Retrieves a specific floor in the supermarket by index.
     *
     * @param index The index of the floor to retrieve.
     * @return The Floor object at the specified index.
     */
    public Floor getFloor(int index) {
        if (index >= 0 && index < floors.length) {
            return floors[index];
        }
        return null;
    }
}
