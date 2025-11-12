package Factories;

import Interfaces.Address;
import Interfaces.NameAndLastName;
import Interfaces.ContactFactory;
import Interfaces.PhoneNumber;
import Uruguay.UruguayAddress;
import Uruguay.UruguayPhone;

public class UruguayContactFactory implements ContactFactory {

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

}
