/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ross
 */
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
    
    public Type getType(){
        return type;
    }
}

enum Type {
    CAR,EMPLOYEE,CUSTOMER
}
