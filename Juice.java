/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Juice product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Juice".
 */
public class Juice extends Product {

    /**
     * Constructs a new Juice product with the specified details.
     * The product type is automatically set to "Juice".
     * 
     * @param productType   The type of the product (ignored, always set to "Juice")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Juice(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Juice", productName, serialNumber, price);
    }    
}
