/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Beef product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Beef".
 */
public class Beef extends Product {

    /**
     * Constructs a new Beef product with the specified details.
     * The product type is automatically set to "Beef".
     * 
     * @param productType   The type of the product (ignored, always set to "Beef")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Beef(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Beef", productName, serialNumber, price);
    }
}
