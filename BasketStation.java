/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The BasketStation class represents the station where shoppers
 * can pick up or return baskets used for carrying items.
 * This class extends Service.
 */
public class BasketStation extends Service {

    /**
     * Constructs a BasketStation with a specified position.
     *
     * @param position the position of the basket station on the floor
     */
    public BasketStation(Position position) {
        super(position, "Basket Station");
    }

    /**
     * Performs the basket service for a shopper, allowing them to
     * pick up or return a basket.
     *
     * @param shopper the shopper using the basket station
     */
    public void performService(Shopper shopper) {
        // Implementation for MCO1 can be added later
    }
}
