/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Soft Drink product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Soft Drink".
 */
public class SoftDrink extends Product {

    /**
     * Constructs a new Soft Drink product with the specified details.
     * The product type is automatically set to "Soft Drink".
     * 
     * @param productType   The type of the product (ignored, always set to "Soft Drink")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public SoftDrink(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Soft Drink", productName, serialNumber, price);
    }
}
