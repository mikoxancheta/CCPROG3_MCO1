/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Amenity class represents any interactable object inside the supermarket.
 * This includes both displays and services that are placed at specific positions
 * on the supermarket floor. It serves as the base class for Display and Service.
 */
public abstract class Amenity {

    /** The position of this amenity on the supermarket floor. */
    protected Position position;

    /**
     * Constructs an Amenity with a specified position.
     *
     * @param position the position of the amenity on the floor
     */
    public Amenity(Position position) {
        this.position = position;
    }

    /**
     * Returns the position of this amenity.
     *
     * @return the position of the amenity
     */
    public abstract void interact(Shopper shopper);
    
    public Position getPosition() {
        return position;
    }

    /**
     * Determines if the amenity is passable by a shopper.
     * By default, amenities are passable unless overridden by subclasses.
     *
     * @return true if the amenity can be passed through, false otherwise
     */
    public boolean isPassable() {
        return true; // default behavior: passable
    }
}
