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
        Car newcar = new Car("Cargo");
        Plane newPlane = new Plane("Private Jet");
        Ship newShip = new Ship("Cruise");


        AccelerateCommand bikeAcceleration = new AccelerateCommand(newBike);
        StartCommand bikeStart = new StartCommand(newBike);
        StopCommand bikeStop = new StopCommand(newBike);

        ParkingController newParking = new ParkingController();

        System.out.println("--Parking  commands starts--");

        newParking.setCommand(bikeStart);



    }
}
