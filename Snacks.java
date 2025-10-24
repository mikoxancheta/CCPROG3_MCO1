/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Snacks product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Snacks".
 */
public class Snacks extends Product {

    /**
     * Constructs a new Snacks product with the specified details.
     * The product type is automatically set to "Snacks".
     * 
     * @param productType   The type of the product (ignored, always set to "Snacks")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Snacks(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Snacks", productName, serialNumber, price);
    }
}
