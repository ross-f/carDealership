/**
 * Class Customer extends SearchableObject
 *
 * This class is a blueprint for the customer objects.
 * In the main these are created into an ArrayList of objects
 */
public class Customer extends SearchableObject {
    private String firstName, lastName;
    private String favouriteCarMake;

    // constuctor for a customer sets all of the attributes on a customer
    public Customer(String firstName, String lastName, String favouriteCarMake) {
        // Constuct the searchable object with firstName + lastName as the name and customer as the type
        super(firstName + " " + lastName, Type.CUSTOMER);
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteCarMake = favouriteCarMake;
    }

    // code below are the getters for all of the attributes on the customer object
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFavouriteCarMake() {
        return favouriteCarMake;
    }
}
