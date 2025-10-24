public Wall(Position position, Address address) {
    super(position);
    this.address = address;
}

    @Override
    public void interact(Shopper shopper) {
        System.out.println("You cannot walk here. It's a wall!");
    }
}
