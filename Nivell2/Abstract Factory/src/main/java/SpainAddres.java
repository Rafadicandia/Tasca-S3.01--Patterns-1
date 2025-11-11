public class SpainAddres implements Address {
    private String street;
    private int number;
    private String door;
    private String floor;
    private String postalCode;
    private String city;
    private String region;

    public SpainAddres(String street, ) {
        this.street = street;
    }

    @Override
    public String getAddress() {
        return "Street: " + street +". "
                +"Number: "+number + ". "
                +"Floor: "+floor + ". "
                +"Door: "+door + ". "
                +"Postal Code: "+postalCode+". "
                +"City: "+city + ". "
                +"Region: "+region;
    }


}
