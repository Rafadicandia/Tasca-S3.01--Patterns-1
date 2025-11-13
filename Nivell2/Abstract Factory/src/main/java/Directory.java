import Domain.Contact;

import java.util.ArrayList;

public class Directory {

    private ArrayList<Contact> contactNamesAndAdddress;

    public Directory(String name){
        
        this.contactNamesAndAdddress = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {

        return contactNamesAndAdddress;
    }
}
