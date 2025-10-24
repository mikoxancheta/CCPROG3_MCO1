import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The CheckoutCounter class allows shoppers to finalize their purchases.
 * When a shopper checks out, a receipt is generated and saved as a text file
 * containing product details, total price, and applicable discounts.
 * 
 * Shoppers with no products cannot check out. If a shopper has equipment,
 * it will be returned to the counter after checkout.
 */
public class CheckoutCounter extends Service {

    /**
     * Constructs a CheckoutCounter with a specified position.
     *
     * @param position The position of the checkout counter in the supermarket.
     */
    public CheckoutCounter(Position position) {
        super("Checkout Counter", position);
    }

    /**
     * Performs the checkout process for a shopper.
     * Generates a receipt, applies discounts, and saves it to a file.
     *
     * @param shopper The shopper checking out.
     */
    public void checkOutShopper(Shopper shopper) {
        // Validation: Must have products
        ArrayList<Product> products = shopper.getProducts();

        if (products.isEmpty()) {
            System.out.println("Cannot checkout. Shopper has no products.");
            return;
        }

        // Create receipt
        Receipt receipt = new Receipt(products, shopper);

        // Calculate subtotal, discount, and total
        receipt.calculateSubtotal();
        receipt.calculateDiscount();
        receipt.calculateTotal();

        // Generate unique filename (with date/time)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String filename = "Receipt_" + shopper.getName() + "_" + timestamp + ".txt";

        // Save to file
        receipt.saveToFile(filename);

        // Return equipment
        if (shopper.getEquipment() != null) {
            System.out.println(shopper.getName() + " returned their " +
                shopper.getEquipment().getClass().getSimpleName() + " to the station.");
            shopper.setEquipment(null);
        }

        // Shopper leaves supermarket
        shopper.getProducts().clear();
        System.out.println(shopper.getName() + " has completed checkout and left the supermarket.");
    }

    /**
     * Overrides the default interaction behavior for a CheckoutCounter.
     * When a shopper interacts, it automatically triggers checkout.
     *
     * @param shopper The shopper interacting with the counter.
     */
    @Override
    public void interact(Shopper shopper) {
        checkOutShopper(shopper);
    }
}
