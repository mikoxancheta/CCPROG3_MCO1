import java.util.HashSet;
import java.util.Random;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * Represents a product sold in the supermarket. Each product has a type, name, 
 * unique serial number (8 characters: 3 letters for type + 5 digits), and price.
 */
public class Product {

    /** The type of the product (e.g., Alcohol, Fruit) */
    private String productType;

    /** The name of the product */
    private String productName;

    /** The unique serial number of the product */
    private String serialNumber;

    /** The price of the product */
    private double price;

    /** Keeps track of generated serial numbers to ensure uniqueness */
    private static final HashSet<String> usedSerialNumbers = new HashSet<>();

    /**
     * Constructs a new Product with automatic serial number generation.
     * 
     * @param productType The type of the product (used for first 3 letters of serial)
     * @param productName The name of the product
     * @param price       The price of the product
     */
    public Product(String productType, String productName, double price) {
        this.productType = productType;
        this.productName = productName;
        this.price = price;
        this.serialNumber = generateSerialNumber(productType);
    }

    /**
     * Generates a unique 8-character serial number based on the product type.
     *
     * @param type The type of the product
     * @return A unique serial number
     */
    private String generateSerialNumber(String type) {
        Random rand = new Random();
        String prefix = type.length() >= 3
                        ? type.substring(0, 3).toUpperCase()
                        : String.format("%-3s", type).replace(' ', 'X');
        String serial;
        do {
            int number = rand.nextInt(100000); // 0 - 99999
            serial = String.format("%s%05d", prefix, number);
        } while (usedSerialNumbers.contains(serial));
        usedSerialNumbers.add(serial);
        return serial;
    }

    /**
     * Returns the type of this product.
     *
     * @return The product type
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Returns the name of this product.
     *
     * @return The product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Returns the unique serial number of this product.
     *
     * @return The product serial number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Returns the price of this product.
     *
     * @return The product price
     */
    public double getPrice() {
        return price;
    }
}
