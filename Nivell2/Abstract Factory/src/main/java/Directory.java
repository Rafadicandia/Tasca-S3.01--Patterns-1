import java.util.ArrayList;

public class Directory {
    private ArrayList<Contact> contactNamesAndAdddress;

    public Directory(ArrayList<Contact> contactNames){

        this.contactNamesAndAdddress = contactNames;
    }

    public ArrayList<Contact> getContacts() {

        return contactNamesAndAdddress;
    }
}
