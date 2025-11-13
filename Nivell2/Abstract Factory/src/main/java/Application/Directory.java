package Application;

import Domain.Contact;

import java.util.ArrayList;

public class Directory {

    private ArrayList<Contact> contactNamesAndAdddress;

    public Directory() {

        this.contactNamesAndAdddress = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {

        return contactNamesAndAdddress;
    }

    public void addContact(Contact contact) {
        this.contactNamesAndAdddress.add(contact);
        System.out.println("Contact added: "+contact.getContactDetails());

    }



}
