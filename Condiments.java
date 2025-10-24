/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Condiments product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Condiments".
 */
public class Condiments extends Product {

    /**
     * Constructs a new Condiments product with the specified details.
     * The product type is automatically set to "Condiments".
     * 
     * @param productType   The type of the product (ignored, always set to "Condiments")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Condiments(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Condiments", productName, serialNumber, price);
    }
}
