/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Entrance class represents the entry point of the supermarket.
 * When a shopper enters, they are registered inside the supermarket.
 * This class extends Service.
 */
public class Entrance extends Service {

    /**
     * Constructs an Entrance with a specified position.
     *
     * @param position the position of the entrance on the floor
     */
    public Entrance(Position position) {
        super(position, "Entrance");
    }

    /**
     * Performs the entrance service for a shopper, allowing them to enter.
     *
     * @param shopper the shopper entering the supermarket
     */
    public void performService(Shopper shopper) {
        // Implementation for MCO1 can be added later
    }
}
