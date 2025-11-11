import java.util.ArrayDeque;
import java.util.Deque;

public class Undo {
    private static Undo uniqueInstance;
    private Deque<String> commandHistory;

    private Undo() {
        this.commandHistory = new ArrayDeque<>();
    }

    public static Object getInstance() {
        if (Undo.uniqueInstance == null) {
            Undo.uniqueInstance = new Undo();
        }
        return Undo.uniqueInstance;

    }

    public void addCommand(String command) {
        this.commandHistory.addFirst(command);

    }

    public String undo(String command) {
        if (this.commandHistory.isEmpty()) {
            return "There are no commands to erase";
        }

        this.commandHistory.removeFirst();

        return this.commandHistory.getFirst();
    }

    public <T> void listCommands() {
        
        for (String t : this.commandHistory)
            toString().indent(t);
    }


}
