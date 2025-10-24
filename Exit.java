/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Exit class represents the exit point of the supermarket.
 * When a shopper exits, their visit is finalized and any remaining
 * equipment is returned to the supermarket.
 * This class extends Service.
 */
public class Exit extends Service {

    /**
     * Constructs an Exit with a specified position.
     *
     * @param position the position of the exit on the floor
     */
    public Exit(Position position) {
        super(position, "Exit");
    }

    /**
     * Performs the exit service for a shopper, finalizing their visit.
     *
     * @param shopper the shopper leaving the supermarket
     */
    public void performService(Shopper shopper) {
        // Implementation for MCO1 can be added later
    }
}
