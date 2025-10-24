/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Noodles product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Noodles".
 */
public class Noodles extends Product {

    /**
     * Constructs a new Noodles product with the specified details.
     * The product type is automatically set to "Noodles".
     * 
     * @param productType   The type of the product (ignored, always set to "Noodles")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Noodles(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Noodles", productName, serialNumber, price);
    }    
}
