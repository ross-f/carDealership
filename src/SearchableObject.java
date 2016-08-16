/**
 * This class creates a base object that is extended to make attributes
 * searchable
 *
 * This means that many classes can extend this and then be Searched
 * by having thier own search pages construced from the Search class
 */
public class SearchableObject {
    // name is the field that is being searched
    // normally constucted as a concatination of two fields in the subclasses of this
    String name;
    Type type;

    SearchableObject(String name, Type type){
        this.name = name;
        this.type = type;
    }
}

// This enum means we can put lables on objects
// This makes casting this class back to its subclass super easy
enum Type {
    CAR,EMPLOYEE,CUSTOMER
}
