/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Service class represents a service station or counter in the supermarket.
 * This is an abstract class because specific services (e.g., CheckoutCounter) must
 * implement the performService method.
 */
public abstract class Service extends Amenity {

    protected Position position;
    protected Address address;
    protected int capacity;
    protected String name;

    /**
     * Constructs a Service with a position and name.
     *
     * @param position The position of the service in the supermarket.
     * @param name     The name of the service.
     */
    public Service(Position position, String name) {
        super(position); // call parent constructor
        this.position = position;
        this.name = name;
        this.capacity = 0; // default
        this.address = null; // default
    }

    /**
     * Constructs a Service with full details.
     *
     * @param position The position of the service
     * @param address  The address or label of the service
     * @param capacity Maximum number of shoppers that can use it
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
     * Abstract method for performing the service.
     * Must be implemented by subclasses.
     *
     * @param shopper The shopper using the service
     */
    public abstract void performService(Shopper shopper);

    /**
     * Optional default interaction for all services.
     * Subclasses can override this.
     *
     * @param shopper The shopper interacting with the service
     */
    @Override
    public void interact(Shopper shopper) {
        performService(shopper);
    }

    // Getters
    public Position getPosition() {
        return position;
    }

    public Address getAddress() {
        return address;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
}
