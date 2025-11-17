package Commands;

public class StopCommand implements Command {
    private Vehicle vehicleToStop;

    public StopCommand(Vehicle vehicleToStop) {
        this.vehicleToStop = vehicleToStop;
    }

    @Override
    public void execute() {
        this.vehicleToStop.stop();
    }
}
