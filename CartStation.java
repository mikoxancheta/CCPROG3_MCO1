/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The CartStation class represents the station where shoppers
 * can pick up or return carts used for carrying items.
 * This class extends Service.
 */
public class CartStation extends Service {

    /**
     * Constructs a CartStation with a specified position.
     *
     * @param position the position of the cart station on the floor
     */
    public CartStation(Position position) {
        super(position, "Cart Station");
    }

    /**
     * Performs the cart service for a shopper, allowing them to
     * pick up or return a cart.
     *
     * @param shopper the shopper using the cart station
     */
    public void performService(Shopper shopper) {
        // Implementation for MCO1 can be added later
    }
}
