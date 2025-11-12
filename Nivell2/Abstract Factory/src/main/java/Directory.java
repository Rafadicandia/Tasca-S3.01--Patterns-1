import java.util.ArrayList;

public class Directory {
    private ArrayList<ContactName> contactNames;

    public Directory(ArrayList<ContactName> contactNames){
        this.contactNames = contactNames;
    }

    public ArrayList<ContactName> getContacts() {
        return contactNames;
    }
}
