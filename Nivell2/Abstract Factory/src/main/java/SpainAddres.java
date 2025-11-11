public class SpainAddres implements Address {
    private String street;
    private int doorNumber;

    public SpainAddres(String street, ) {
        this.street = street;
    }

    @Override
    public String getAddress() {
        return street + doorNumber + floor;
    }


}
