/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * Abstract base class for all services in the supermarket, including
 * checkout counters, basket/cart stations, entrances, exits, and product search.
 */
public abstract class Service extends Amenity {

    /** Position of the service on the floor */
    protected Position position;

    /** Name of the service */
    protected String name;

    /** Optional address of the service */
    protected Address address;

    /** Optional capacity (e.g., number of baskets/carts, or max checkout lines) */
    protected int capacity;

    /**
     * Constructor for services with position and name (for stations like Basket/Cart/Entrance/Exit)
     *
     * @param position Position of the service on the floor
     * @param name     Name of the service
     */
    public Service(Position position, String name) {
        super(position);
        this.position = position;
        this.name = name;
    }

    /**
     * Constructor for services with position, address, capacity, and name
     * (used for CheckoutCounter).
     *
     * @param position Position of the service
     * @param address  Address/location info of the service
     * @param capacity Maximum number of items or users the service can handle
     * @param name     Name of the service
     */
    public Service(Position position, Address address, int capacity, String name) {
        super(position);
        this.position = position;
        this.address = address;
        this.capacity = capacity;
        this.name = name;
    }

    /**
     * Abstract method for performing the service for a shopper.
     *
     * @param shopper The shopper using the service
     */
    public abstract void performService(Shopper shopper);

    /**
     * Default interaction triggers the service.
     *
     * @param shopper The shopper interacting with this service
     */
    public void interact(Shopper shopper) {
        performService(shopper);
    }

    /** @return The name of the service */
    public String getName() {
        return name;
    }

    /** @return The address of the service */
    public Address getAddress() {
        return address;
    }

    /** @return The capacity of the service */
    public int getCapacity() {
        return capacity;
    }
}
