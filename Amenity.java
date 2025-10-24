/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Amenity class represents any interactable object inside the supermarket.
 * This includes both displays and services that are placed at specific positions
 * on the supermarket floor. It serves as the base class for Display and Service.
 */
public class Amenity {

    /** The position of this amenity on the supermarket floor. */
    private Position position;

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
    public Position getPosition() {
        return position;
    }
}
