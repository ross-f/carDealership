import java.util.Date;

public class Customer extends SearchableObject {
    private String firstName, lastName;
    private String favouriteCarMake;
    
    // constuctor for a customer who hasnt purchased anything yet
    public Customer(String firstName, String lastName, String favouriteCarMake) {
        super(firstName + " " + lastName, Type.CUSTOMER);
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteCarMake = favouriteCarMake;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavouriteCarMake() {
        return favouriteCarMake;
    }

    public void setFavouriteCarMake(String favouriteCarMake) {
        this.favouriteCarMake = favouriteCarMake;
    }
}
