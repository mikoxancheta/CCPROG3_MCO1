public class Wall extends Amenity {
    public Wall(Position position) {
        super(position);
    }

    @Override
    public void interact(Shopper shopper) {
        System.out.println("You cannot walk here. It's a wall!");
    }
}
