import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Receipt class represents a transaction record for a shopper's purchases.
 * It contains the list of purchased products, calculates subtotal, discount,
 * and total amounts, and can also save the receipt details into a text file.
 *
 * For MCO1, this class focuses on generating and displaying receipt information
 * in the console, with simple discount and total calculations.
 */
public class Receipt {

    /** The list of purchased products in this transaction. */
    private ArrayList<Product> products;

    /** The subtotal before discounts are applied. */
    private double subtotal;

    /** The discount amount to be applied (if any). */
    private double discount;

    /** The final total after applying discounts. */
    private double total;

    /** The shopper associated with this receipt. */
    private Shopper shopper;

    /**
     * Constructs a Receipt with the given list of purchased products and shopper.
     *
     * @param products The list of purchased products.
     * @param shopper  The shopper associated with the purchase.
     */
    public Receipt(ArrayList<Product> products, Shopper shopper) {
        this.products = products;
        this.shopper = shopper;
        this.subtotal = 0.0;
        this.discount = 0.0;
        this.total = 0.0;
    }

    /**
     * Calculates the subtotal by summing up the prices of all purchased products.
     *
     * @return The computed subtotal value.
     */
    public double calculateSubtotal() {
        subtotal = 0.0;
        for (Product p : products) {
            subtotal += p.getPrice();
        }
        return subtotal;
    }

    /**
     * Calculates any applicable discount based on certain conditions.
     * For MCO1, this can be a placeholder rule:
     * Example: If subtotal > 500, apply a 5% discount.
     *
     * @return The computed discount value.
     */
    public double calculateDiscount() {
        if (subtotal > 500) {
            discount = subtotal * 0.05; // 5% discount
        } else {
            discount = 0.0;
        }
        return discount;
    }

    /**
     * Calculates the final total after discount.
     *
     * @return The computed total value.
     */
    public double calculateTotal() {
        total = subtotal - discount;
        return total;
    }

    /**
     * Generates a formatted receipt text for display or file saving.
     *
     * @return The complete receipt as a String.
     */
    public String generateReceiptText() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== SUPERMARKET RECEIPT ===\n");
        sb.append("Shopper: ").append(shopper.getName()).append("\n");
        sb.append("Age: ").append(shopper.getAge()).append("\n\n");

        sb.append("Items Purchased:\n");
        for (Product p : products) {
            sb.append(String.format(" - %-20s ₱%.2f%n", p.getProductName(), p.getPrice()));
        }

        sb.append("\nSubtotal: ₱").append(String.format("%.2f", subtotal)).append("\n");
        sb.append("Discount: ₱").append(String.format("%.2f", discount)).append("\n");
        sb.append("-----------------------------\n");
        sb.append("Total: ₱").append(String.format("%.2f", total)).append("\n");
        sb.append("=============================\n");

        return sb.toString();
    }

    /**
     * Saves the generated receipt details into a text file.
     *
     * @param filename The name of the file to save the receipt to.
     */
    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(generateReceiptText());
            System.out.println("Receipt saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error saving receipt to file: " + e.getMessage());
        }
    }

    /** @return The subtotal amount. */
    public double getSubtotal() {
        return subtotal;
    }

    /** @return The discount amount. */
    public double getDiscount() {
        return discount;
    }

    /** @return The total amount. */
    public double getTotal() {
        return total;
    }

    /** @return The list of purchased products. */
    public ArrayList<Product> getProducts() {
        return products;
    }
}
