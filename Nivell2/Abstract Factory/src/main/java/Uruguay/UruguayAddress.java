package Uruguay;

import Interfaces.Address;

public class UruguayAddress implements Address {
    private String street;
    private int number;
    private String door;
    private String floor;
    private String postalCode;
    private String city;
    private String country;


    public UruguayAddress(String street, int number, String door, String floor, String postalCode, String city, String country) {
        if (street == (null) || street.isBlank()) {
            throw new IllegalArgumentException("The street can't be null nor empty");
        }

        if (number < 0) {
            throw new IllegalArgumentException("The punctuation can't be lower than 0");
        }

        if (postalCode == (null) || postalCode.isBlank()) {
            throw new IllegalArgumentException("The Postal Code can't be null nor empty");
        }

        if (city == (null) || city.isBlank()) {
            throw new IllegalArgumentException("The City can't be null nor empty");
        }

        if (country == (null) || country.isBlank()) {
            throw new IllegalArgumentException("The City can't be null nor empty");
        }

        if (door == (null) || door.isBlank()) {
            this.door = "NA";
        } else {
            this.door = door;
        }

        if (floor == (null) || floor.isBlank()) {
            this.floor = "NA";
        } else {
            this.floor = floor;
        }

        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String getAddress() {
        return "Street: " + this.street + ". "
                + "Number: " + this.number + ". "
                + "Floor: " + this.floor + ". "
                + "Door: " + this.door + ". "
                + "City: " + this.city + ". "
                + "Postal Code: " + this.postalCode + ". "
                + "Region: " + this.country;
    }


}
