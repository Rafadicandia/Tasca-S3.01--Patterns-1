public class Ship extends Vehicle {
    public Ship(String type) {
        super(type);
    }

    @Override
    public void accelerate() {
        System.out.println("The ship is accelerating");
    }

    @Override
    public void start() {
        System.out.println("The ship is accelerating");
    }

    @Override
    public void stop() {
        System.out.println("The ship is accelerating");
    }
}
