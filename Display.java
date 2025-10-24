// Represents any product display inside the supermarket (i.e., Table, ChilledCounter, Refrigerator, and Shelf). 
import java.util.ArrayList;

public class Display extends Amenity {
    private Address address;
    private int capacity;                
    private ArrayList<Product> products; 

    public Display(Position position, Address address, int capacity) {
        super(position);
        this.address = address;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (products.size() < capacity) {
            products.add(product);
        }
    }
  
    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getAvailableSlots() {
        return capacity - products.size();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
