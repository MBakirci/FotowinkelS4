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
        //ToDo: code in commentaar controleren
        //throws SQLException {
        //  String Query = "SELECT * FROM *"
        //  try {
        //      stmt = con.createStatement();
        //      ResultSet rs = stmt.executeQuery;
        //      while (rs.next()){
        //          String catName = rs.getString("");
        //          Categories.add(catName);
        //      }
        //  }
        //  catch (SQLException e ){
        //      JDBCTutorialUtilities.printSQLException(e);
        //  }
        //  finally{
        //      if (stmt != null) { stmt.close();
        //  }
        //}
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
    public void SetCategory(String Category){
        this.CurrentCatogory = Category;
    }
    
    //create new categorie
    public boolean CreateCategory(String Category){
        //todo: database logica
        return false;
    }
}
