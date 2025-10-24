/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Floor in the supermarket. Each floor contains a 2D map 
 * of amenities. It provides methods to access amenities at specific coordinates 
 * and check if a cell is passable for shoppers.
 */
public class Floor {

    /** 2D map representing the floor layout with amenities */
    private Amenity[][] map;

    /**
     * Constructs a new Floor object with a default layout.
     * Initializes the map with predefined dimensions and empty amenities.
     */
    public Floor() {
        int width = 10;
        int height = 10;
        map = new Amenity[width][height];

        // Initialize each cell with a default Amenity at its Position
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                map[x][y] = new Amenity(new Position(x, y));
            }
        }
    }

    /**
     * Returns the Amenity located at the specified coordinates.
     * 
     * @param x The x-coordinate (column) of the map
     * @param y The y-coordinate (row) of the map
     * @return The Amenity at the given coordinates, or null if out of bounds
     */
    public Amenity getAmenityAt(int x, int y) {
        if (x >= 0 && x < map.length && y >= 0 && y < map[0].length) {
            return map[x][y];
        } else {
            return null;
        }
    }

    /**
     * Checks whether the cell at the given coordinates is passable by a shopper.
     * Assumes the Amenity class or its subclasses have an isPassable() method.
     * 
     * @param x The x-coordinate (column) of the map
     * @param y The y-coordinate (row) of the map
     * @return true if the cell is passable, false otherwise
     */
    public boolean isPassable(int x, int y) {
        Amenity amenity = getAmenityAt(x, y);
        if (amenity instanceof PassableAmenity) { // example interface/class for passable amenities
            return ((PassableAmenity) amenity).isPassable();
        }
        return false;
    }

    /**
     * Sets an Amenity at the specified coordinates.
     * Useful for updating the floor layout dynamically.
     * 
     * @param x       The x-coordinate (column) of the map
     * @param y       The y-coordinate (row) of the map
     * @param amenity The Amenity to place at the given location
     */
    public void setAmenityAt(int x, int y, Amenity amenity) {
        if (x >= 0 && x < map.length && y >= 0 && y < map[0].length) {
            map[x][y] = amenity;
        }
    }
}
