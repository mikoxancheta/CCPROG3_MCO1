import java.util.ArrayList;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Shopper class represents a customer in the supermarket who can move around,
 * face directions, interact with amenities, and pick up or return products.
 * A shopper can carry up to two hand-carried products and may use a basket or cart
 * to hold additional items. All interactions are console-based for MCO1.
 */
public class Shopper {

    /** The shopper's name. */
    private String name;

    /** The shopper's age. */
    private int age;

    /** The direction the shopper is currently facing (up, down, left, right). */
    private String direction;

    /** The shopper's current position on the floor. */
    private Position position;

    /** The equipment used by the shopper (Basket or Cart). */
    private Equipment equipment;

    /** The list of products currently carried by the shopper. */
    private ArrayList<Product> carriedProducts;

    /**
     * Constructs a Shopper with the specified name, age, and initial position.
     *
     * @param name      The shopper's name.
     * @param age       The shopper's age.
     * @param position  The shopper's starting position.
     */
    public Shopper(String name, int age, Position position) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.direction = "down"; // Default facing direction
        this.equipment = null;   // No equipment at the start
        this.carriedProducts = new ArrayList<>();
    }

    /**
     * Moves the shopper in the specified direction by adjusting their position.
     * The direction can be "up", "down", "left", or "right".
     *
     * @param direction The direction to move ("up", "down", "left", or "right").
     */
    public void move(String direction) {
        this.direction = direction;

        switch (direction.toLowerCase()) {
            case "up":
                position.setY(position.getY() - 1);
                break;
            case "down":
                position.setY(position.getY() + 1);
                break;
            case "left":
                position.setX(position.getX() - 1);
                break;
            case "right":
                position.setX(position.getX() + 1);
                break;
            default:
                System.out.println("Invalid direction! Use up, down, left, or right.");
                return;
        }

        System.out.println(name + " moved " + direction + " to position (" 
            + position.getX() + ", " + position.getY() + ").");
    }

    /**
     * Updates the shopper's facing direction without moving.
     *
     * @param direction The direction to face ("up", "down", "left", or "right").
     */
    public void face(String direction) {
        this.direction = direction;
        System.out.println(name + " is now facing " + direction + ".");
    }

    /**
     * Allows the shopper to interact with an amenity (Display or Service).
     *
     * @param amenity The amenity being interacted with.
     */
    public void interact(Amenity amenity) {
        if (amenity != null) {
            amenity.interact(this);
        } else {
            System.out.println("There is nothing to interact with.");
        }
    }

   /**
 * Picks up a product if the shopper can still carry more (max: 2),
 * and if age restrictions are satisfied.
 * 
 * Shoppers under 18 cannot pick up Alcohol or Cleaning Agent products.
 *
 * @param product The product to be picked up.
 */
public void pickupProduct(Product product) {
    if (product == null) {
        System.out.println("Invalid product.");
        return;
    }

    // Check for age restrictions
    String productType = product.getProductType().toLowerCase();
    if (age < 18 && (productType.equals("alcohol") || productType.equals("cleaning agent"))) {
        System.out.println(name + " is not allowed to pick up " + product.getProductName() + ".");
        return;
    }

    // Check carrying capacity
    if (canCarryAnotherProduct()) {
        carriedProducts.add(product);
        System.out.println(name + " picked up " + product.getProductName() + ".");
    } else {
        System.out.println(name + " cannot carry more than 2 hand-carried products.");
    }
}

    /**
     * Returns a product previously picked up by the shopper.
     *
     * @param product The product to be returned.
     */
    public void returnProduct(Product product) {
        if (product == null) {
            System.out.println("Invalid product.");
            return;
        }

        if (carriedProducts.remove(product)) {
            System.out.println(name + " returned " + product.getProductName() + ".");
        } else {
            System.out.println("Product not found in carried items.");
        }
    }

    /**
     * Checks if the shopper can carry another product.
     * A shopper can only carry a maximum of two hand-carried products.
     * 
     * @return true if the shopper can carry more products, false otherwise.
     */
    public boolean canCarryAnotherProduct() {
        return carriedProducts.size() < 2;
    }

    /**
     * Returns the list of products currently carried by the shopper.
     *
     * @return The ArrayList of carried products.
     */
    public ArrayList<Product> getProducts() {
        return carriedProducts;
    }

    /**
 * Adds a product to the shopper's hand-carried items or equipment.
 *
 * @param product Product to add
 */
    public void addToCart(Product product) {
        pickupProduct(product);
    }

    /** @return The shopper's name. */
    public String getName() {
        return name;
    }

    /** @return The shopper's age. */
    public int getAge() {
        return age;
    }

    /** @return The shopper's current position. */
    public Position getPosition() {
        return position;
    }

    /** Sets the shopper's position. */
    public void setPosition(Position position) {
        this.position = position;
    }

    /** @return The shopper's equipment. */
    public Equipment getEquipment() {
        return equipment;
    }

    /** Sets the shopper's equipment. */
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
