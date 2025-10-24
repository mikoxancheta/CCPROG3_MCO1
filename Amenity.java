public abstract class Amenity {
    private Position position;

    public Amenity(Position position) {
        this.position = position;
    }

    // Getter for position
    public Position getPosition() {
        return position;
    }

    // Setter for position (optional, in case position can change)
    public void setPosition(Position position) {
        this.position = position;
    }

    // Abstract method for shopper interaction
    // Each subclass will define what happens when a shopper interacts with it.
    public abstract void interact(Shopper shopper);
}
