/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Cereal product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Cereal".
 */
public class Cereal extends Product {

    /**
     * Constructs a new Cereal product with the specified details.
     * The product type is automatically set to "Cereal".
     * 
     * @param productType   The type of the product (ignored, always set to "Cereal")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Cereal(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Cereal", productName, serialNumber, price);
    }
}
