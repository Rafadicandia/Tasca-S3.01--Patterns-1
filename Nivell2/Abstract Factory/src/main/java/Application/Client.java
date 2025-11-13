package Application;

import Factories.SpainContactFactory;
import Factories.UruguayContactFactory;
import Interfaces.ContactFactory;
import Domain.Contact; // Necesario para la instancia de Contact

public class Client {

    public static void main(String[] args) {


        Directory agenda = new Directory();


        ContactFactory spainFactory = new SpainContactFactory();


        Contact c1 = spainFactory.createContact(
                );
        agenda.addContact(c1);


        ContactFactory uruguayFactory = new UruguayContactFactory();


        Contact c2 = uruguayFactory.createContact(
                "Rafael",
                "di Candia",
                "098312416",
                "Mariscala",
                1925,
                "2",
                "2",
                "11600",
                "Montevideo",
                "Montevideo",
                "Uruguay");
        agenda.addContact(c2);


        agenda.getContacts();
    }
}