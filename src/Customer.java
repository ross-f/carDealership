
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ross
 */
public class Customer extends SearchableObject {
    private String firstName, lastName;
    private Date dateOfBirth;
    private String favouriteCarMake;
    private ArrayList<Car> purchased;
    
    // constuctor for a customer who hasnt purchased anything yet
    public Customer(String firstName, String lastName, Date dateOfBirth, String favouriteCarMake) {
        super(firstName + " " + lastName, Type.CUSTOMER);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.favouriteCarMake = favouriteCarMake;
    }
    
    // constructor for purchased car 
    public Customer(String firstName, String lastName, Date dateOfBirth, String favouriteCarMake, ArrayList<Car> purchased){
        this(firstName,lastName,dateOfBirth,favouriteCarMake);
        this.purchased = purchased;
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

    public ArrayList<Car> getPurchasedCars() {
        return purchased;
    }

    public void setPurchasedCars(ArrayList<Car> purchased) {
        this.purchased = purchased;
    }
}
