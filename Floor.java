/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * The Floor class represents a supermarket floor. It contains a fixed 22x22
 * 2D map of amenities and provides methods to access, update, and check
 * if a cell is passable by a shopper.
 */
public class Floor {

    /** 2D map representing the floor layout with amenities */
    private Amenity[][] map;

    /**
     * Constructs a Floor with fixed size 22x22.
     * Initializes all cells with a default Amenity at each position.
     * The outer edges of the floor are considered walls and are not passable.
     */
    public Floor() {
        map = new Amenity[22][22];

        for (int x = 0; x < 22; x++) {
            for (int y = 0; y < 22; y++) {
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
        }
        return null;
    }

    /**
     * Updates the Amenity at the specified coordinates.
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

    /**
     * Checks whether a cell at the given coordinates is passable by a shopper.
     * Cells at the outer edges (walls) and Service amenities are not passable.
     *
     * @param x The x-coordinate (column) of the map
     * @param y The y-coordinate (row) of the map
     * @return true if the cell is passable, false otherwise
     */
    public boolean isPassable(int x, int y) {
        // Outer edges are walls
        if (x == 0 || x == 21 || y == 0 || y == 21) {
            return false;
        }

        Amenity amenity = getAmenityAt(x, y);
        if (amenity instanceof Service) { // services block the path
            return false;
        }

        return true; // everything else is passable
    }
}
