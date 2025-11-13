package Factories;

import Interfaces.*;
import Spain.SpainAddress;
import Spain.SpainPhone;


public class SpainContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String street, int number, String door, String floor, String postalCode, String city, String region) {
        return new SpainAddress(street, number, door, floor, postalCode, city, region);
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new SpainPhone("634330718");
    }

    @Override
    public NameAndLastName createFullName() {
        return new FullName("Rafael", "di Candia");
    }




}



