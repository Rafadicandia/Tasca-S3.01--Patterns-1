import java.util.ArrayDeque;
import java.util.Deque;

public class Undo {
    private static Undo uniqueInstance;
    private Deque<String> commandHistory;

    private Undo() {
        this.commandHistory = new ArrayDeque<>();
    }

    public static Undo getInstance() {
        if (Undo.uniqueInstance == null) {
            Undo.uniqueInstance = new Undo();
        }
        return Undo.uniqueInstance;

    }

    public void addCommand(String command) {
        this.commandHistory.addFirst(command);

    }

    public String undo() {
        if (this.commandHistory.isEmpty()) {
            return "There are no commands to erase";
        }

        String lastCommand = this.commandHistory.removeFirst();
        return "Undo command: '" + lastCommand + "'";
    }

    public void listCommands() {
        System.out.println("--- Command History ---");

        int index = 1;

        for(String command : this.commandHistory){
            System.out.println(index + "-" + command);
            index ++;

        }

    }


}
