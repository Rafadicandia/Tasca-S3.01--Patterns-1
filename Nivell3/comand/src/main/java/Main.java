import Commands.AccelerateCommand;
import Commands.StartCommand;
import Commands.StopCommand;
import Vehicles.Bike;
import Vehicles.Car;
import Vehicles.Plane;
import Vehicles.Ship;

public class Main {
    public static void main(String[] args) {

        Bike newBike = new Bike("Montain bike");
        Car newCar = new Car("Cargo");
        Plane newPlane = new Plane("Private Jet");
        Ship newShip = new Ship("Cruise");

        //Instances of methods for every vehicle
        //Bike
        AccelerateCommand bikeAcceleration = new AccelerateCommand(newBike);
        StartCommand bikeStart = new StartCommand(newBike);
        StopCommand bikeStop = new StopCommand(newBike);
        //Car
        AccelerateCommand carAcceleration = new AccelerateCommand(newCar);
        StartCommand carStart = new StartCommand(newCar);
        StopCommand carStop = new StopCommand(newCar);
        //Plane
        AccelerateCommand planeAcceleration = new AccelerateCommand(newPlane);
        StartCommand planeStart = new StartCommand(newPlane);
        StopCommand planeStop = new StopCommand(newPlane);
        //Ship
        AccelerateCommand shipAcceleration = new AccelerateCommand(newShip);
        StartCommand shipStart = new StartCommand(newShip);
        StopCommand shipStop = new StopCommand(newShip);

        //New Instance of parking for testing the commands
        ParkingController newParking = new ParkingController();

        System.out.println("--Parking  commands starts--");

        System.out.println("--Parking> Proceedes to move Bike--");

        newParking.setCommand(bikeStart);
        newParking.executeCommand();
        newParking.setCommand(bikeAcceleration);
        newParking.executeCommand();
        newParking.setCommand(bikeStop);
        newParking.executeCommand();

        System.out.println("--Parking> Proceedes to move Car--");

        newParking.setCommand(carStart);
        newParking.executeCommand();
        newParking.setCommand(carAcceleration);
        newParking.executeCommand();
        newParking.setCommand(carStop);
        newParking.executeCommand();

        System.out.println("--Parking> Proceedes to move Plane--");

        newParking.setCommand(planeStart);
        newParking.executeCommand();
        newParking.setCommand(planeAcceleration);
        newParking.executeCommand();
        newParking.setCommand(planeStop);
        newParking.executeCommand();

        System.out.println("--Parking> Proceedes to move Ship--");

        newParking.setCommand(shipStart);
        newParking.executeCommand();
        newParking.setCommand(shipAcceleration);
        newParking.executeCommand();
        newParking.setCommand(shipStop);
        newParking.executeCommand();


    }
}
