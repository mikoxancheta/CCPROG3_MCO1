/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Supermarket class represents the entire simulation environment.
 * It contains the floors of the supermarket and one shopper who moves
 * within the supermarket during the simulation.
 *
 * For MCO1, only the basic structure is implemented — the simulation logic
 * will be added in MCO2.
 */
public class Supermarket {

    /** The list of floors in the supermarket. */
    private Floor[] floors;

    /** The shopper currently inside the supermarket. */
    private Shopper shopper;

    /**
     * Constructs a Supermarket and initializes its floors.
     * For MCO1, only the first floor is used.
     */
    public Supermarket() {
        // For MCO1, the supermarket starts with a single floor.
        floors = new Floor[1];
        floors[0] = new Floor(); // Initialize first floor

        // Shopper will be initialized later (e.g., upon entering)
        shopper = null;
    }

    /**
     * Starts the supermarket simulation.
     * Initializes or sets up the shopper and floor layout.
     */
    public void startSimulation() {
        // For MCO1, simulation setup can be basic or empty.
        // Actual logic will be implemented in MCO2.
        System.out.println("Starting supermarket simulation...");
    }

    /**
     * Moves the shopper in a given direction.
     * This will be implemented in MCO2 to handle shopper movement.
     *
     * @param direction the direction to move (e.g., "up", "down", "left", "right")
     */
    public void moveShopper(String direction) {
        // Placeholder for movement logic
    }

    /**
     * Returns the floor at the given index.
     *
     * @param index the index of the floor
     * @return the floor at the specified index
     */
    public Floor getFloor(int index) {
        if (index >= 0 && index < floors.length) {
            return floors[index];
        }
        return null;
    }
}
