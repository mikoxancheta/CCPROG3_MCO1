/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents a Position on the supermarket floor.
 * It stores the x (column) and y (row) coordinates and provides 
 * getter and setter methods for both.
 */
public class Position {

    /** The x-coordinate (column) */
    private int x;

    /** The y-coordinate (row) */
    private int y;

    /**
     * Constructs a new Position with the specified coordinates.
     * 
     * @param x The x-coordinate (column)
     * @param y The y-coordinate (row)
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x-coordinate of this position.
     * 
     * @return The x-coordinate
     */
    public int getX() {
        return this.x;
    }

    /**
     * Returns the y-coordinate of this position.
     * 
     * @return The y-coordinate
     */
    public int getY() {
        return this.y;
    }

    /**
     * Sets the x-coordinate of this position.
     * 
     * @param x The new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y-coordinate of this position.
     * 
     * @param y The new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }
}
