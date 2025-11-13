import java.util.ArrayList;

public class Directory {
    private String name;
    private ArrayList<Contact> contactNamesAndAdddress;

    public Directory(String name){
        this.name = name;
        this.contactNamesAndAdddress = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {

        return contactNamesAndAdddress;
    }
}
