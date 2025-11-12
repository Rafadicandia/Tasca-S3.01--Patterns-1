import Interfaces.NameAndLastName;

public class FullName implements NameAndLastName {
    private String name;
    private String lastName;

    public FullName(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String getFullName() {
        return "Contact name: "+name
                +"-"+
                "Contact last name: "+lastName;
    }
}
