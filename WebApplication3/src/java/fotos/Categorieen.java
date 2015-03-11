/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Coen
 */
public class Categorieen {
    //huidige categorie
    String CurrentCatogory;
    public Categorieen(){
        
    }
    
    //load all categories form database
    public List<String> GetAllCategories(){
        List<String> Categories = new ArrayList<>();
        //ToDo: alle categorieën uit de database ophalen
        //dummydata:
        Categories.add("DummyCat");
        Categories.add("NewDummy");
        Categories.add("TestDummy");
        Categories.add("DummyDoll");
        Categories.add("LaDummy");
        Categories.add("LastDummy");
        Categories.add("DummyBase");
        Categories.add("LordDummy");
        return Categories;
    }
    
    //set CurrentCategrorie
    public void SetCategory(String Categorie){
        this.CurrentCatogory = Categorie;
    }
}
