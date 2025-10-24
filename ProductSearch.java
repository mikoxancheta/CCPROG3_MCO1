/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The ProductSearch class represents a service area where shoppers
 * can search for products available in the supermarket.
 * This class extends Service.
 */
public class ProductSearch extends Service {

    /**
     * Constructs a ProductSearch service with a specified position.
     *
     * @param position the position of the product search station
     */
    public ProductSearch(Position position) {
        super(position, "Product Search");
    }

    /**
     * Allows a shopper to search for a product by name.
     *
     * @param shopper the shopper performing the search
     */
    public void performService(Shopper shopper) {
        // Implementation for MCO1 can be added later
    }
}
