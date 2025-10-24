/**
 * CCPROG3 MCO1 - Supermarket Simulator
 *
 * The Shelf class represents a display area in the supermarket
 * that stores products such as snacks, canned goods, noodles, cereal,
 * softdrink, juice, alcohol, and condiments.
 * A shelf has a specific position, address, and capacity, inherited from Display.
 */
public class Shelf extends Display {

    /**
     * Constructs a Shelf with a specified position, address, and capacity.
     *
     * @param position the position of the shelf on the floor
     * @param address the address or section label of the shelf
     * @param capacity the maximum number of products that can be displayed
     */
    public Shelf(Position position, Address address, int capacity) {
        super(position, address, capacity, "Shelf");
    }

    @Override
    public void interact(Shopper shopper) {
        // Interaction logic
    }
}
