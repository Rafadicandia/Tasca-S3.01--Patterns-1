package Factories;

import Domain.ContactGenerator;
import Domain.FullName;
import Interfaces.*;
import Spain.SpainAddress;
import Spain.SpainPhone;


public class SpainContactFactory implements ContactFactory {

    @Override
    public Contact createContact(
            String name,
            String lastName,
            String phoneNumber,
            String street,
            int number,
            String door,
            String floor,
            String postalCode,
            String city,
            String region,
            String country
    ) {

        NameAndLastName fullName = new FullName(name, lastName);


        PhoneNumber phone = new SpainPhone(phoneNumber);

        Address address = new SpainAddress(
                street, number, door, floor, postalCode, city, region
        );


        return new ContactGenerator(fullName, address, phone);
    }

}



