package Commands;

public class AccelerateCommand implements Command {
    private Vehicle vehicleToAccelerate;

    public AccelerateCommand(Vehicle vehicleToAccelerate) {
        this.vehicleToAccelerate = vehicleToAccelerate;
    }

    @Override
    public void execute() {
        this.vehicleToAccelerate.accelerate();
    }
}
