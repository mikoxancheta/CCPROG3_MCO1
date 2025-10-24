/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Service class represents a service area in the supermarket where specific
 * actions or interactions occur, such as entrances, exits, checkout counters, or
 * stations for baskets and carts. Each service has a type that defines its purpose.
 *
 * This class extends Amenity and acts as a base for more specific service types.
 */
public class Service extends Amenity {

    /** The type of service (e.g., "Entrance", "Exit", "Checkout"). */
    private String type;

    /**
     * Constructs a Service with a specified position and type.
     *
     * @param position the position of the service on the floor
     * @param type the kind of service represented
     */
    public Service(Position position) {
        super(position);
    }

    /**
     * Returns the type of this service.
     *
     * @return the type of service
     */
    public String getType() {
        return type;
    }

    /**
     * Performs a service for the shopper.
     * This will be implemented differently in subclasses
     * such as Entrance, Exit, and CheckoutCounter.
     *
     * @param shopper the shopper receiving the service
     */
    public void performService(Shopper shopper) {
        // Implementation will depend on subclass type
    }

    @Override
public void interact(Shopper shopper) {
    System.out.println("Interacting with the service: " + this.getClass().getSimpleName());
    // You can customize behavior per service type
    }
}
