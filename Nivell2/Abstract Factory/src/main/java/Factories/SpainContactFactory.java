package Factories;

import Interfaces.Address;
import Interfaces.ContactFactory;
import Interfaces.PhoneNumber;

public class SpainContactFactory implements ContactFactory {

    @Override
    public Address createAddress() {
        return new SpainAddress("Carretera de Rubí", 135, "3", "2", "08223", "Terrassa", "Catalunya");
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new SpainPhone("634330718");
    }
}
