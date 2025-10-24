/**
 * CCPROG3 MCO1 - Supermarket Simulator
 * 
 * This class represents an Address within the supermarket, including the floor, 
 * grouping (section/aisle), and number (specific identifier). It provides 
 * accessor methods to retrieve each attribute.
 */
public class Address {

    /** The floor where the address is located */
    private String floor;

    /** The grouping or section of the address */
    private String grouping;

    /** The number identifying the specific location */
    private int number;

    /**
     * Constructs a new Address with the specified floor, grouping, and number.
     * 
     * @param floor The floor where the address is located
     * @param grouping The grouping or section of the address
     * @param number The number identifying the specific location
     */
    public Address(String floor, String grouping, int number) {
        this.floor = floor;
        this.grouping = grouping;
        this.number = number;
    }

    /**
     * Returns the floor of the address.
     * 
     * @return The floor as a String
     */
    public String getFloor() {
        return this.floor;
    }

    /**
     * Returns the grouping or section of the address.
     * 
     * @return The grouping as a String
     */
    public String getGrouping() {
        return this.grouping;
    }

    /**
     * Returns the number identifying the specific location of the address.
     * 
     * @return The number as an integer
     */
    public int getNumber() {
        return this.number;
    }
}
