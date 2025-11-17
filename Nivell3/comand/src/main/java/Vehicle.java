public abstract class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public abstract void accelerate();

    public abstract void start();

    public abstract void stop();


}
