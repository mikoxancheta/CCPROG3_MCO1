import java.util.ArrayList;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents Equipment in the supermarket, such as baskets or carts.
 * Each equipment has a type, capacity, and can hold multiple products.
 * It provides methods to add and remove products while respecting the capacity limit.
 */
public class Equipment {

    /** The type of equipment (e.g., basket, cart) */
    private String type;

    /** The maximum number of products the equipment can hold */
    private int capacity;

    /** The list of products currently in the equipment */
    private ArrayList<Product> products;

    /**
     * Constructs a new Equipment object with the specified type and capacity.
     * Initializes the product list as empty.
     * 
     * @param type The type of equipment
     * @param capacity The maximum number of products it can hold
     */
    public Equipment(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.products = new ArrayList<Product>();
    }

    /**
     * Adds a product to the equipment if there is available capacity.
     * Prints a message indicating success or if the equipment is full.
     * 
     * @param product The product to add
     */
    public void addProduct(Product product) {
        if (products.size() < capacity) {
            products.add(product);
            System.out.println(product.getProductName() + " successfully added to " + type);
        } else {
            System.out.println("Full capacity reached. Cannot add " + product.getProductName() + " to " + type);
        }
    }

    /**
     * Removes a product from the equipment if it exists.
     * Prints a message indicating success or if the product was not found.
     * 
     * @param product The product to remove
     */
    public void removeProduct(Product product) {
        if (products.remove(product)) {
            System.out.println(product.getProductName() + " removed from " + type);
        } else {
            System.out.println(product.getProductName() + " not found");
        }
    }

    /**
     * Returns the list of products currently in the equipment.
     * 
     * @return An ArrayList of Product objects
     */
    public ArrayList<Product> getProducts() {
        return this.products;
    }

    /**
     * Returns the capacity of the equipment.
     * 
     * @return The maximum number of products it can hold
     */
    public int getCapacity() {
        return this.capacity;
    }
}
