/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Canned Goods product in the supermarket.
 * It inherits from the Product class and initializes the product type as "Canned Goods".
 */
public class CannedGoods extends Product {

    /**
     * Constructs a new Canned Goods product with the specified details.
     * The product type is automatically set to "Canned Goods".
     * 
     * @param productType   The type of the product (ignored, always set to "Canned Goods")
     * @param productName   The name of the product
     * @param serialNumber  The unique serial number of the product
     * @param price         The price of the product
     */
    public CannedGoods(
        String productType,
        String productName,
        String serialNumber,
        double price
    ) {
        super("Canned Goods", productName, serialNumber, price);
    }
}
