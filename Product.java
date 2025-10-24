/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Product in the supermarket.
 * It serves as the superclass for specific product types (e.g., Alcohol, Beef, Fruit).
 * Each product has a type, name, serial number, and price.
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

    /**
     * Constructs a new Product with the specified details.
     * 
     * @param productType   The type of the product
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Product(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        this.productType = productType;
        this.productName = productName;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    /**
     * Returns the type of the product.
     * 
     * @return The product type
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * Returns the name of the product.
     * 
     * @return The product name
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * Returns the serial number of the product.
     * 
     * @return The serial number
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * Returns the price of the product.
     * 
     * @return The product price
     */
    public double getPrice() {
        return this.price;
    }
}
