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


        AccelerateCommand bikeAcceleration = new AccelerateCommand(newBike);
        StartCommand bikeStart = new StartCommand(newBike);
        StopCommand bikeStop = new StopCommand(newBike);

        AccelerateCommand carAcceleration = new AccelerateCommand(newCar);
        StartCommand carStart = new StartCommand(newCar);
        StopCommand carStop = new StopCommand(newCar);

        ParkingController newParking = new ParkingController();

        System.out.println("--Parking  commands starts--");

        System.out.println("--Parking> Procedes to move Bike--");

        newParking.setCommand(bikeStart);
        newParking.executeCommand();
        newParking.setCommand(bikeAcceleration);
        newParking.executeCommand();
        newParking.setCommand(bikeStop);
        newParking.executeCommand();

        System.out.println("--Parking> Procedes to move Car--");

        newParking.setCommand(carStart);
        newParking.executeCommand();
        newParking.setCommand(carAcceleration);
        newParking.executeCommand();
        newParking.setCommand(carStop);
        newParking.executeCommand();



    }
}
