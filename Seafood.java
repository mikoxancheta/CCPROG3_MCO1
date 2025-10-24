/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Seafood product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Seafood".
 */
public class Seafood extends Product {

    /**
     * Constructs a new Seafood product with the specified details.
     * The product type is automatically set to "Seafood".
     * 
     * @param productType   The type of the product (ignored, always set to "Seafood")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Seafood(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Seafood", productName, serialNumber, price);
    }
}
