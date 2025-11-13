package Application;

import Factories.SpainContactFactory;
import Factories.UruguayContactFactory;
import Interfaces.ContactFactory;
import Domain.ContactGenerator;

public class Client {

    public static void main(String[] args) {


        Directory agenda = new Directory();


        ContactFactory spainFactory = new SpainContactFactory();


        Interfaces.Contact c1 = spainFactory.createContact(
                "Pedro",
                "Sanchez",
                "634330718",
                "Moncloa",
                456,
                "4",
                "4",
                "0975",
                "Madrid",
                "Madrid",
                "Spain"
                );
        agenda.addContact((ContactGenerator) c1);


        ContactFactory uruguayFactory = new UruguayContactFactory();


        Interfaces.Contact c2 = uruguayFactory.createContact(
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
        agenda.addContact((ContactGenerator) c2);


        agenda.getContacts();
    }
}