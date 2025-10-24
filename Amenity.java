// Represents any interactable object inside the supermarket.
// Used as a base class for Display and Service.
public class Amenity {
    private Position position;
    
    public Amenity(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
