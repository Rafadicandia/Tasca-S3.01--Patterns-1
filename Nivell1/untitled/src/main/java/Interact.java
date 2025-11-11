import java.util.Scanner;

public class Interact {

    public void userInterface() {
        Scanner sc = new Scanner(System.in);
        Undo undoManager = Undo.getInstance();
        boolean on = true;

        System.out.println("Write your commands!");

        while (on) {
            System.out.println(">");
            String in = sc.nextLine();
            String command = in.toLowerCase().trim();


            switch (command) {

                case "history" -> undoManager.listCommands();
                case "undo" -> undoManager.undo();
                case "exit" -> {
                    System.out.println("Exiting program");
                    on = false;

                }
                default -> undoManager.addCommand(command);


            }


        }
    }

}
