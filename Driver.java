import java.util.Scanner;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Driver class runs the console-based simulation of the supermarket.
 * It allows the user to create a shopper, move them around using WASD keys,
 * change direction with IJKL, and interact using the Space key.
 */
public class Driver {

    /**
     * The main entry point for the program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean restart;

        do {
            Supermarket supermarket = new Supermarket(); // Reset supermarket each restart

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

            // Ask user if they want to restart the simulation
            System.out.print("\nDo you want to restart the simulation? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();
            restart = choice.equals("yes");

            if (!restart) {
                System.out.println("\nSimulation ended. Thank you for visiting the Supermarket Simulator!");
            }

        } while (restart);

        scanner.close();
    }
}
