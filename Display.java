import java.util.ArrayList;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Display class represents a display area within the supermarket that holds
 * products. Examples of displays include tables, chilled counters, refrigerators, and
 * shelves. Each display has a specific position, address, and capacity,
 * and contains multiple products that shoppers can view or take.
 *
 * This class extends Amenity and is used as a base for specific display types.
 */
public class Display extends Amenity {

    /** The address or section identifier of this display. */
    private Address address;

    /** The maximum number of products that can be displayed. */
    private int capacity;

    /** The list of products currently placed on the display. */
    private ArrayList<Product> products;

    /**
     * Constructs a Display with a specified position, address, and capacity.
     *
     * @param position the position of the display on the floor
     * @param address the address or section label of the display
     * @param capacity the maximum number of products that can be held
     */
    public Display(Position position, Address address, int capacity) {
        super(position);
        this.address = address;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    /**
     * Adds a product to the display if there is available capacity.
     *
     * @param product the product to add to the display
     */
    public void addProduct(Product product) {
        if (products.size() < capacity) {
            products.add(product);
        }
    }

    /**
     * Removes a product from the display.
     *
     * @param product the product to remove from the display
     */
    public void removeProduct(Product product) {
        products.remove(product);
    }

    /**
     * Returns the number of available product slots on the display.
     *
     * @return the number of remaining available slots
     */
    public int getAvailableSlots() {
        return capacity - products.size();
    }

    /**
     * Returns the list of products currently on the display.
     *
     * @return a list of products displayed
     */
    public ArrayList<Product> getProducts() {
        return products;
    }
}
