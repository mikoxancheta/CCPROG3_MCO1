import java.util.ArrayList;

//Super class
public class Equipment{
    private String type;
    private int capacity;
    private ArrayList<Product> products;

    public Equipment(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.products = new ArrayList<Product>();
    }

    //addProduct() checks if equipment capacity is full 
    //then transfers the product inside the equipment.
    public void addProduct(Product product) {
        if (products.size() < capacity) {
            products.add(product);
            System.out.println(product.getProductName() + " successfully added to " + type);
        }
        else {
            System.out.println("Full capacity reached. Cannot add " + product.getProductName() + " to " + type);
        }
    }

    //removeProduct() checks if product exists 
    //inside equipment and removes it
    public void removeProduct(Product product) {
        if (products.remove(product)) {
            System.out.println(product.getProductName() + " removed from " + type);
        }
        else {
            System.out.println(product.getProductName() + " not found");
        }
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public int getCapacity() {
        return this.capacity;
    }
}


