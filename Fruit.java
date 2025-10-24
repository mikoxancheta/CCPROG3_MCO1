/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Fruit product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Fruit".
 */
public class Fruit extends Product {

    /**
     * Constructs a new Fruit product with the specified details.
     * The product type is automatically set to "Fruit".
     * 
     * @param productType   The type of the product (ignored, always set to "Fruit")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public Fruit(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Fruit", productName, serialNumber, price);
    }
}
