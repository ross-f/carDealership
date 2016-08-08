public class SearchableObject {
    String name;
    Type type;
    
    SearchableObject(String name, Type type){
        this.name = name;
        this.type = type;
    }
    
    // TAKE THIS OUT AND CAST INSTEAD
    public SearchableObject getBasicObject() {
        return new SearchableObject(name,type);
    }
}

enum Type {
    CAR,EMPLOYEE,CUSTOMER
}
