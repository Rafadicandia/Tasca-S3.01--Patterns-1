public class Undo {
    private static Undo uniqueInstance;

    private Undo() {

    }

    public static Object getInstance() {
        if (Undo.uniqueInstance == null) {
            Undo.uniqueInstance = new Undo();
        }
        return Undo.uniqueInstance;

    }
        

}
