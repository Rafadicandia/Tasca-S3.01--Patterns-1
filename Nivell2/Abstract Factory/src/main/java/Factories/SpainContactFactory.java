package Factories;

import Domain.FullName;
import Interfaces.*;
import Spain.SpainAddress;
import Spain.SpainPhone;


public class SpainContactFactory implements ContactFactory {

    @Override
    public Address createAddress() {
        return new SpainAddress("Carretera de Rubí", 135, "3", "2", "08223", "Terrassa", "Catalunya");
    }

    @Override
    public PhoneNumber createPhoneNumber() {

        return new SpainPhone("634330718");
    }

    @Override
    public NameAndLastName createFullName() {

        return new FullName("Rafael", "di Candia");
    }

    Contact spanishContact = new Contact() {
        @Override
        public String getContactDetails() {
            return "";
        }
    }


}



