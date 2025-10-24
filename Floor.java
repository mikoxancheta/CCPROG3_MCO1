import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * The Floor class represents a supermarket floor. It contains a fixed 22x22
 * 2D map of amenities and provides methods to access, update, and check
 * if a cell is passable by a shopper. It also assigns random products to displays.
 */
public class Floor {

    private Amenity[][] map;
    private Random random = new Random();

    // Address grouping for Walls and Aisles
    private Address wallAddress = new Address("Wall 1", "Wall", 0);
    private Address aisleAddress = new Address("Aisle 1", "Aisle", 0);

    // Example: default capacity for services/displays
    private int defaultCapacity = 5;

    public Floor() {
        map = new Amenity[22][22];

        // Initialize all cells as empty walkable tiles
        for (int x = 0; x < 22; x++) {
            for (int y = 0; y < 22; y++) {
                map[x][y] = new Amenity(new Position(x, y)) {
                    @Override
                    public void interact(Shopper shopper) {
                        System.out.println("Nothing here to interact with.");
                    }
                };
            }
        }

        setupWallsAndAisles();
        setupDisplaysAndServices();
    }

    private void setupWallsAndAisles() {
        // Example Walls (add all your wall positions here)
        map[0][1] = new Wall(new Position(0, 1), wallAddress);
        map[0][2] = new Wall(new Position(0, 2), wallAddress);
        // ... add all walls based on map

        // Example Aisles
        for (int x = 4; x <= 7; x++) {
            map[x][20] = new Wall(new Position(x, 20), aisleAddress); // Aisle 1
        }
        // ... add remaining aisles
    }

    private void setupDisplaysAndServices() {
        // Example ChilledCounter: Chicken
        for (int y = 1; y <= 6; y++) {
            ChilledCounter counter = new ChilledCounter(new Position(1, y), defaultCapacity);
            assignProducts(counter, "Chicken");
            map[1][y] = counter;
        }

        // Example Shelf: Alcohol
        for (int x = 4; x <= 7; x++) {
            for (int y = 2; y <= 3; y++) {
                Shelf shelf = new Shelf(new Position(x, y), defaultCapacity);
                assignProducts(shelf, "Alcohol");
                map[x][y] = shelf;
            }
        }

        // Add remaining displays/services similarly
    }

    private void assignProducts(Display display, String type) {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < defaultCapacity; i++) {
            String name = type + " Item " + (i + 1);
            double price = 50 + random.nextInt(100); // Random price 50-149
            productList.add(new Product(name, type, price));
        }
        display.setProducts(productList);
    }

    public Amenity getAmenityAt(int x, int y) {
        if (x >= 0 && x < map.length && y >= 0 && y < map[0].length) {
            return map[x][y];
        }
        return null;
    }

    public void setAmenityAt(int x, int y, Amenity amenity) {
        if (x >= 0 && x < map.length && y >= 0 && y < map[0].length) {
            map[x][y] = amenity;
        }
    }

    public boolean isPassable(int x, int y) {
        if (x == 0 || x == 21 || y == 0 || y == 21) return false;

        Amenity amenity = getAmenityAt(x, y);
        if (amenity instanceof Service) return false;

        return true;
    }
}
