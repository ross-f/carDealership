import java.util.Date;

public class Customer extends SearchableObject {
    private String firstName, lastName;
    private Date dateOfBirth;
    private String favouriteCarMake;
    
    // constuctor for a customer who hasnt purchased anything yet
    public Customer(String firstName, String lastName, Date dateOfBirth, String favouriteCarMake) {
        super(firstName + " " + lastName, Type.CUSTOMER);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFavouriteCarMake() {
        return favouriteCarMake;
    }

    public void setFavouriteCarMake(String favouriteCarMake) {
        this.favouriteCarMake = favouriteCarMake;
    }
}
