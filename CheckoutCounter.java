/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The CheckoutCounter class represents the area where shoppers
 * pay for their selected items. After checkout, the shopper's
 * equipment (basket or cart) is returned to its respective station.
 * This class extends Service.
 */
public class CheckoutCounter extends Service {

    /**
     * Constructs a CheckoutCounter with a specified position.
     *
     * @param position the position of the checkout counter on the floor
     */
    public CheckoutCounter(Position position) {
        super(position, "Checkout Counter");
    }

    /**
     * Performs the checkout service for a shopper.
     *
     * @param shopper the shopper checking out their items
     */
    public void performService(Shopper shopper) {
        // Implementation for MCO1 can be added later
    }
}
