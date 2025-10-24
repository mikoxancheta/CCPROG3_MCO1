/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents an Alcohol product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Alcohol".
 */
public class Alcohol extends Product {

    /**
     * Constructs a new Alcohol product with the specified details.
     * The product type is automatically set to "Alcohol".
     * 
     * @param productType   The type of the product (ignored, always set to "Alcohol")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Alcohol(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Alcohol", productName, serialNumber, price);
    }
}
