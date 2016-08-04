import java.util.Date;

class Car extends SearchableObject {
    private String make, reg, colour, model;
    private double price;
    private double numberOfMiles;
    private Date soldDate;

    // Constructor to allow new objects to be made quickly
    // A new car that is added to the system is never already sold so the date is set to null
    Car(String make, String model, String colour, String reg,
               double price, double numberOfMiles) {
        super(make + " " + model, Type.CAR);
        this.make = make;
        this.reg = reg;
        this.colour = colour;
        this.model = model;
        this.price = price;
        this.numberOfMiles = numberOfMiles;
        soldDate = null;
    }

    /*
     Setters are here for things that can be changed while it's in stock
       - Colour
       - Price
       - Number of miles
       - Date soldDate
    */
    String getMake() {
        return make;
    }

    String getReg() {
        return reg;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    String getColour() {
        return colour;
    }

    String getModel() {
        return model;
    }


    void setPrice(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    void setNumberOfMiles(double numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    double getNumberOfMiles() {
        return numberOfMiles;
    }

    void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    Date isSold() {
        return soldDate;
    }
}
