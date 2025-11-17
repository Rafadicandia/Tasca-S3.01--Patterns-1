import Commands.Command;

public class ParkingController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }


    public void executeCommand() {
        this.command.execute();

    }
}
