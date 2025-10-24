/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Refrigerator class represents a display used for milk,
 * frozen food, and cheese. It inherits from Display.
 */
public class Refrigerator extends Display {

    /**
     * Constructs a Refrigerator with a specified position, address, and capacity.
     *
     * @param position the position of the refrigerator on the floor
     * @param address the address or section label of the refrigerator
     * @param capacity the maximum number of products that can be displayed
     */
    public Refrigerator(Position position, Address address, int capacity) {
        super(position, address, capacity);
    }
}
