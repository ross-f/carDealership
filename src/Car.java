/**
 * Class Car is Searchable
 * this means the class can be used by the Search class to search through an
 * ArrayList of objects
 */
class Car extends SearchableObject {
    private String make, reg, colour, model;
    private double price;
    private double numberOfMiles;

    // Constructor to allow new objects to be made quickly
    Car(String make, String model, String colour, String reg,
               double price, double numberOfMiles) {
        // Call the searchable object class
        // Construct the name attribute as the make and the model
        // Also constuct the type as CAR
        super(make + " " + model, Type.CAR);
        this.make = make;
        this.reg = reg;
        this.colour = colour;
        this.model = model;
        this.price = price;
        this.numberOfMiles = numberOfMiles;
    }

    // Code below is getters for the car object this will get the data from all the private attributes
    String getMake() {
        return make;
    }

    String getReg() {
        return reg;
    }

    String getColour() {
        return colour;
    }

    String getModel() {
        return model;
    }


    double getPrice() {
        return price;
    }

    double getNumberOfMiles() {
        return numberOfMiles;
    }
}
