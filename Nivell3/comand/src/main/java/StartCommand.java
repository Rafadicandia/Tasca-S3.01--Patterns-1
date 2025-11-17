public class StartCommand implements Command {
    private Vehicle vehicleToStart;

    public StartCommand(Vehicle vehicleToStart) {
        this.vehicleToStart = vehicleToStart;
    }


    @Override
    public void execute() {
        this.vehicleToStart.start();
    }
}
