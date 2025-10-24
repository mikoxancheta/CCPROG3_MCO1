import java.util.ArrayList;
import java.util.Scanner;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * Represents a display area that holds products. Each display is restricted
 * to a specific product type (e.g., a Table can only hold Fruits).
 * 
 * This class extends Amenity and serves as a base for specific display types.
 */
public class Display extends Amenity {

    private Address address;
    private int capacity;
    /** List of products currently on the display */
    private ArrayList<Product> products;

    /** Only products of this type can be added to this display */
    private String allowedProductType;

    /**
     * Constructs a Display with a position, address, capacity, and allowed product type.
     *
     * @param position           The position of the display on the floor
     * @param address            The address or section label of the display
     * @param capacity           Maximum number of products the display can hold
     * @param allowedProductType The type of product allowed in this display
     */
    public Display(Position position, Address address, int capacity, String allowedProductType) {
        super(position);
        this.address = address;
        this.capacity = capacity;
        this.products = new ArrayList<>(capacity);
        this.allowedProductType = allowedProductType;
    }

    /**
     * Adds a product to the display if it matches the allowed type and there is available capacity.
     *
     * @param product The product to add
     */
    public void addProduct(Product product) {
        if (product.getProductType().equalsIgnoreCase(allowedProductType)) {
            products.add(product);
        }
    }

    /**
     * Removes a product from the display.
     *
     * @param product The product to remove
     */
    public void removeProduct(Product product) {
        products.remove(product);
    }

    /**
     * Returns the number of available slots left in this display.
     *
     * @return Remaining available slots
     */
    public int getAvailableSlots() {
        return capacity - products.size();
    }

    /**
     * Returns the list of products currently on the display.
     *
     * @return List of products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * Returns the allowed product type for this display.
     *
     * @return The allowed product type
     */
    public String getAllowedProductType() {
        return allowedProductType;
    }

    /**
     * Returns the address of this display.
     *
     * @return The display's address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Returns the maximum capacity of this display.
     *
     * @return Maximum number of products
     */
    public int getCapacity() {
        return capacity;
    }
    
    @Override
    public void interact(Shopper shopper) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are at the " + allowedProductType + " display.");

        if (products.isEmpty()) {
            System.out.println("Sorry, this display is empty!");
            return;
        }

        System.out.println("Products available:");
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.println((i + 1) + ". " + p.getProductName() + " (" + p.getSerialNumber() + ") - ₱" + p.getPrice());
        }

        System.out.print("Enter the number of the product you want to pick (0 to cancel): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice > 0 && choice <= products.size()) {
            Product picked = products.get(choice - 1);
            shopper.addToCart(picked);
            System.out.println("Added " + picked.getProductName() + " to your cart!");
        } else {
            System.out.println("No product picked.");
        }
    }
}
