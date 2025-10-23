public class Address {
    private String floor;
    private String grouping;
    private int number;

    public Address(
        String floor,
        String grouping, 
        int number
    ) {
        this.floor = floor;
        this.grouping = grouping;
        this.number = number;
    }

    public String getFloor() {
        return this.floor;
    }

    public String getGrouping() {
        return this.grouping;
    }

    public int getNumber() {
        return this.number;
    }
}
