/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The ChilledCounter class represents a refrigerated display counter
 * used for products such as seafood, chicken, and beef. It inherits from Display.
 */
public class ChilledCounter extends Display {

    /**
     * Constructs a ChilledCounter with a specified position, address, and capacity.
     *
     * @param position the position of the chilled counter on the floor
     * @param address the address or section label of the chilled counter
     * @param capacity the maximum number of products that can be displayed
     */
    public ChilledCounter(Position position, Address address, int capacity) {
        super(position, address, capacity);
    }
}
