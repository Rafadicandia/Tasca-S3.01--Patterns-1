public class Plane extends Vehicle {
    public Plane(String type) {
        super(type);
    }

    @Override
    public void accelerate() {
        System.out.println("The plane is accelerating");
    }

    @Override
    public void start() {
        System.out.println("The plane is starting");
    }

    @Override
    public void stop() {
        System.out.println("The plane is stopping");
    }


}
