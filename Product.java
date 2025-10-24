/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * Represents a product sold in the supermarket.
 * Each product has a type, name, unique serial number (8 characters: 3 letters for type + 5 digits), and price.
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
     * Constructs a new Product with manual serial number assignment.
     * 
     * @param productType  The type of the product (e.g., Fruit, Cereal)
     * @param productName  The name of the product
     * @param serialNumber The unique 8-character serial number of the product
     * @param price        The price of the product
     */
    public Product(String productType, String productName, String serialNumber, double price) {
        this.productType = productType;
        this.productName = productName;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    // ---------------------- GETTERS ----------------------

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
