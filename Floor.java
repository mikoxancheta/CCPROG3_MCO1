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
     * Initializes all cells with a default walkable Amenity and then assigns
     * specific amenities according to the floor plan.
     */
    public Floor() {
        map = new Amenity[22][22];

        // Initialize all empty tiles
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

        // Assign all fixed amenities
        initializeFloor();
    }

    /**
     * Sets up all walls, displays, services, and other special amenities
     * according to the predefined map layout.
     */
    private void initializeFloor() {
        // Walls
        for (int y = 0; y <= 21; y++) map[0][y] = new Wall(new Position(0, y));
        for (int y = 0; y <= 21; y++) map[21][y] = new Wall(new Position(21, y));
        for (int x = 0; x <= 21; x++) map[x][0] = new Wall(new Position(x, 0));
        for (int x = 0; x <= 21; x++) map[x][21] = new Wall(new Position(x, 21));
        for (int y = 0; y <= 9; y++) map[21][y] = new Wall(new Position(21, y));
        for (int y = 12; y <= 21; y++) map[21][y] = new Wall(new Position(21, y));
        map[17][10] = new Wall(new Position(17, 10));
        map[17][11] = new Wall(new Position(17, 11));
        map[18][1] = new Wall(new Position(18, 1));
        map[18][3] = new Wall(new Position(18, 3));
        map[18][5] = new Wall(new Position(18, 5));
        map[18][7] = new Wall(new Position(18, 7));
        map[18][10] = new Wall(new Position(18, 10));
        map[18][11] = new Wall(new Position(18, 11));
        map[18][14] = new Wall(new Position(18, 14));
        map[18][16] = new Wall(new Position(18, 16));
        map[18][18] = new Wall(new Position(18, 18));
        map[18][20] = new Wall(new Position(18, 20));

        // ChilledCounters
        for (int y = 1; y <= 6; y++) map[1][y] = new ChilledCounter(new Position(1, y), "Chicken");
        for (int y = 8; y <= 13; y++) map[1][y] = new ChilledCounter(new Position(1, y), "Beef");
        for (int y = 15; y <= 20; y++) map[1][y] = new ChilledCounter(new Position(1, y), "Fish");

        // Shelves
        for (int x = 4; x <= 7; x++) {
            for (int y = 2; y <= 3; y++) map[x][y] = new Shelf(new Position(x, y), "Alcohol");
            for (int y = 6; y <= 7; y++) map[x][y] = new Shelf(new Position(x, y), "Softdrink");
            for (int y = 14; y <= 15; y++) map[x][y] = new Shelf(new Position(x, y), "Cereal");
            for (int y = 18; y <= 19; y++) map[x][y] = new Shelf(new Position(x, y), "CannedGoods");
        }
        for (int x = 10; x <= 13; x++) {
            for (int y = 2; y <= 3; y++) map[x][y] = new Shelf(new Position(x, y), "Condiments");
            for (int y = 6; y <= 7; y++) map[x][y] = new Shelf(new Position(x, y), "Milk");
            for (int y = 14; y <= 15; y++) map[x][y] = new Shelf(new Position(x, y), "Noodles");
            for (int y = 18; y <= 19; y++) map[x][y] = new Shelf(new Position(x, y), "Snacks");
        }

        // Tables
        for (int x = 4; x <= 7; x++) for (int y = 10; y <= 11; y++) map[x][y] = new Table(new Position(x, y), "Fruits");
        for (int x = 10; x <= 13; x++) for (int y = 10; y <= 11; y++) map[x][y] = new Table(new Position(x, y), "Fruits");

        // ProductSearch
        map[15][8] = new ProductSearch(new Position(15, 8));
        map[15][13] = new ProductSearch(new Position(15, 13));

        // BasketStation & CartStation
        map[20][1] = new BasketStation(new Position(20, 1));
        map[20][20] = new CartStation(new Position(20, 20));

        // Entrance & Exit
        map[21][11] = new Entrance(new Position(21, 11));
        map[21][10] = new Exit(new Position(21, 10));

        // CheckoutCounters
        int[] checkoutCols = {2, 4, 6, 8, 13, 15, 17, 19};
        for (int col : checkoutCols) map[18][col] = new CheckoutCounter(new Position(18, col));
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
        // Outer edges are walls
        if (x == 0 || x == 21 || y == 0 || y == 21) {
            return false;
        }

        Amenity amenity = getAmenityAt(x, y);
        if (amenity instanceof Service) {
            return false;
        }

        return true;
    }
}
