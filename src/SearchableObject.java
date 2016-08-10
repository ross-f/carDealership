public class SearchableObject {
    String name;
    Type type;
    
    SearchableObject(String name, Type type){
        this.name = name;
        this.type = type;
    }
}

enum Type {
    CAR,EMPLOYEE,CUSTOMER
}
