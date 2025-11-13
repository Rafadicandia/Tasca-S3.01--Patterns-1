package Application;

import Domain.ContactGenerator;

import java.util.ArrayList;

public class Directory {

    private ArrayList<ContactGenerator> contactGeneratorNamesAndAdddresses;

    public Directory() {

        this.contactGeneratorNamesAndAdddresses = new ArrayList<>();
    }

    public ArrayList<ContactGenerator> getContacts() {

        return contactGeneratorNamesAndAdddresses;
    }

    public void addContact(ContactGenerator contactGenerator) {
        this.contactGeneratorNamesAndAdddresses.add(contactGenerator);
        System.out.println("--Contact added-- " + "\n"
                + contactGenerator.getContactDetails());

    }


}
