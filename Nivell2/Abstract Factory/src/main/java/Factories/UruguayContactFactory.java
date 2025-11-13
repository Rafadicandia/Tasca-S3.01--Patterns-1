package Factories;

import Domain.FullName;
import Interfaces.*;
import Uruguay.UruguayAddress;
import Uruguay.UruguayPhone;

public class UruguayContactFactory implements ContactFactory {

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


        PhoneNumber phone = new UruguayPhone(phoneNumber);

        Address address = new UruguayAddress(
                street, number, door, floor, postalCode, city, country
        );


        return new Contact(fullName, address, phone);
    }

}
