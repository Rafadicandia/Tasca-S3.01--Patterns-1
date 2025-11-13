package Interfaces;

public interface ContactFactory {
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
            String region
    );
}
