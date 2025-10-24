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
 * Calculates any applicable discount based on the shopper's age
 * and product types. 
 *
 * Shoppers aged 60 and above get:
 * - 20% discount on food
 * - 10% discount on beverages
 * Alcohol products are excluded from discounts.
 *
 * @return The computed discount value.
 */
public double calculateDiscount() {
    discount = 0.0;

    if (shopper != null && shopper.getAge() >= 60) {
        for (Product p : products) {
            String type = p.getProductType().toLowerCase();

            if (type.equals("alcohol")) {
                continue; // No discount on alcohol
            } else if (isFood(type)) {
                discount += p.getPrice() * 0.20; // 20% off food
            } else if (isBeverage(type)) {
                discount += p.getPrice() * 0.10; // 10% off drinks
            }
        }
    }

    return discount;
}

/**
 * Helper method to identify if a product type is a food.
 *
 * @param type The product type.
 * @return True if the product is a food type.
 */
private boolean isFood(String type) {
    return type.equals("fruit") || type.equals("chicken") || type.equals("beef") ||
           type.equals("seafood") || type.equals("snacks") || type.equals("cereal") ||
           type.equals("noodles") || type.equals("canned goods") || type.equals("condiments");
}

/**
 * Helper method to identify if a product type is a beverage.
 *
 * @param type The product type.
 * @return True if the product is a drink type.
 */
private boolean isBeverage(String type) {
    return type.equals("softdrink") || type.equals("juice");
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
    sb.append(String.format("%-10s %-20s %10s%n", "Serial", "Product Name", "Price"));
    sb.append("--------------------------------------------------\n");

    for (Product p : products) {
        sb.append(String.format("%-10s %-20s ₱%.2f%n", p.getSerialNumber(), p.getProductName(), p.getPrice()));
    }

    sb.append("--------------------------------------------------\n");
    sb.append(String.format("Subtotal: ₱%.2f%n", subtotal));
    sb.append(String.format("Discount: ₱%.2f%n", discount));
    sb.append(String.format("Total: ₱%.2f%n", total));
    sb.append("==================================================\n");

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
