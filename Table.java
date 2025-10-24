/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Table class represents a display area used for fruits and other
 * products that do not require refrigeration. It inherits all attributes
 * and behavior from the Display class.
 */
public class Table extends Display {

    /**
     * Constructs a Table with a specified position, address, and capacity.
     *
     * @param position the position of the table on the floor
     * @param address the address or section label of the table
     * @param capacity the maximum number of products that can be displayed
     */
    public Table(Position position, Address address, int capacity) {
        super(position, address, capacity, "Table");
    }

    @Override
    public void interact(Shopper shopper) {
        // Interaction logic
    }
}
