import java.util.ArrayList;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Supermarket class represents the supermarket environment containing
 * one or more floors and a shopper. For MCO1, only a single floor is required.
 * This class provides core functionality for managing supermarket data and
 * delegating actions to the shopper.
 */
public class Supermarket {
    private ArrayList<Display> displays = new ArrayList<>();

    public void addDisplay(Display display) {
        displays.add(display);
    }

    /** The list of floors in the supermarket. */
    private Floor[] floors;

    /** The active shopper currently in the supermarket. */
    private Shopper shopper;

    /**
     * Constructs a Supermarket with one floor for MCO1.
     */
    public Supermarket() {
        floors = new Floor[1];
        floors[0] = new Floor();
        shopper = null;
    }

    public ArrayList<Display> getDisplays() {
        return displays;
    }

    /**
     * Initializes a new shopper inside the supermarket.
     *
     * @param name The shopper's name.
     * @param age  The shopper's age.
     */
    public void addShopper(String name, int age) {
        shopper = new Shopper(name, age, new Position(0, 0));
        System.out.println("Shopper " + name + " has entered the supermarket.");
    }

    /**
     * Moves the shopper in the specified direction.
     *
     * @param direction The direction to move ("up", "down", "left", or "right").
     */
    public void moveShopper(String direction) {
        if (shopper != null) {
            shopper.move(direction);
        } else {
            System.out.println("No shopper found inside the supermarket.");
        }
    }

    /**
     * Allows the shopper to interact with an amenity.
     * (For MCO1, this can be simulated or left minimal.)
     */
    public void interact() {
        if (shopper != null) {
            System.out.println(shopper.getName() + " interacts with the nearby amenity (if any).");
        } else {
            System.out.println("No shopper to interact with amenities.");
        }
    }

    /**
     * Returns the shopper object.
     *
     * @return The current shopper.
     */
    public Shopper getShopper() {
        return shopper;
    }

    /**
     * Retrieves a specific floor in the supermarket by index.
     *
     * @param index The index of the floor.
     * @return The Floor object if index is valid, otherwise null.
     */
    public Floor getFloor(int index) {
        if (index >= 0 && index < floors.length) {
            return floors[index];
        }
        return null;
    }
}
