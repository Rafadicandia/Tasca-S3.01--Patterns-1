package Uruguay;

import Interfaces.Address;

public class UruguayAddress implements Address {
    private String street;
    private int number;
    private String door;
    private String floor;
    private String postalCode;
    private String city;
    private String region;


    public UruguayAddress(String street, int number, String door, String floor, String postalCode, String city, String region) {
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

        if (region == (null) || region.isBlank()) {
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
        this.region = region;
    }

    @Override
    public String getAddress() {
        return "Street: " + this.street + ". "
                + "Number: " + this.number + ". "
                + "Floor: " + this.floor + ". "
                + "Door: " + this.door + ". "
                + "Postal Code: " + this.postalCode + ". "
                + "City: " + this.city + ". "
                + "Region: " + this.region;
    }


}
