package Vehicles;

public class Bike extends Vehicle {

    public Bike(String type) {
        super(type);
    }

    @Override
    public void accelerate() {
        System.out.println("The bike is accelerating");

    }

    @Override
    public void start() {
        System.out.println("The bike is accelerating");

    }

    @Override
    public void stop() {
        System.out.println("The bike is accelerating");

    }
}
