import java.util.ArrayList;

public class Directory {
    private ArrayList<Contact> contacts;

    public Directory(ArrayList<Contact> contacts){
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
