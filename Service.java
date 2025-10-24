// Represents a service area in the supermarket (i.e. Entrance, Exit, BasketStation, CartStation, ProductSearch, and CheckoutCounter).

public class Service extends Amenity {
    private String type;

    public Service(Position position, String type) {
        super(position); 
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void performService(Shopper shopper) {
        // Implementation will vary depending on subclass (Entrance, Exit, etc.)
    }
}
