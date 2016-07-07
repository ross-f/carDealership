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
    
    SearchableObject(String name){
        this.name = name;
    }
    
    public SearchableObject getBasicObject() {
        return new SearchableObject(name);
    }
}
