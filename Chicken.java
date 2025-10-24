/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Chicken product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Chicken".
 */
public class Chicken extends Product {

    /**
     * Constructs a new Chicken product with the specified details.
     * The product type is automatically set to "Chicken".
     * 
     * @param productType   The type of the product (ignored, always set to "Chicken")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Chicken(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Chicken", productName, serialNumber, price);
    }
}
