package Factories;

import Domain.FullName;
import Interfaces.*;
import Uruguay.UruguayAddress;
import Uruguay.UruguayPhone;

public class UruguayContactFactory implements ContactFactory {
    private String name;
    private String lastName;

    @Override
    public Address createAddress() {
        return new UruguayAddress("Manuel Alonso", 1688, "10", "1", "11600", "Montevideo", "Uruguay");
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new UruguayPhone("09898312416");
    }

    @Override
    public NameAndLastName createFullName() {
        return new FullName("Rafael", "di Candia");
    }

    @Override
    public Contact createContact() {
        return null;
    }

}
