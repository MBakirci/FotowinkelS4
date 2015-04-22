/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import oracle.jdbc.OracleTypes;

/**
 *
 * @author Coen
 */
public class Categorieën {
    //huidige categorie
    String CurrentCatogory;
    Databaseconnector dbhelp;

    public Categorieën(){
        dbhelp = new Databaseconnector();
    }
    
    //load all categories form database
    public List<Categorie> GetAllCategories() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        List<Categorie> categories = new ArrayList<>();
            if (dbhelp.verbindmetDatabase()) {
                PreparedStatement stament = null;
            
                String Query = "SELECT * FROM CATEGORIE";
                    
                try {
                    stament = dbhelp.conn.prepareStatement(Query);
                    ResultSet result = stament.executeQuery();
                    Categorie cat = null;
                    while(result.next()){
                        cat = new Categorie(result.getInt("ITEM_ID"), result.getString("NAAM"));
                        categories.add(cat);
                    }
                }
            
                catch (SQLException e ){
                    System.out.print(e.toString());
                    categories = null;
                }
                finally{
                    if (stament != null) { stament.close();}
                }
            }
            return categories;
        }
    
    //set CurrentCategrorie
    public void SetCurrentCategory(String Category){
        this.CurrentCatogory = Category;
    }
    
    public String GetCurrentCategory(){
        return this.CurrentCatogory;
    }
    
    //create new categorie
    public boolean CreateCategory(String category) throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
        if (dbhelp.verbindmetDatabase()) {
            PreparedStatement stament = null;
            PreparedStatement stamentItem = null;
            int id = 0;
            
            String QueryItem = "INSERT INTO ITEM (TYPE, AANGEMAAKTOP) values ('categorie', ?)";
            String Query = "INSERT INTO CATEGORIE (ITEM_ID, NAAM) values (?, ?)";
            try{
                stamentItem = dbhelp.conn.prepareStatement(QueryItem, new String[]{"ID"});
                DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
                Date date = new Date();
                stamentItem.setString(1, dateFormat.format(date));
                stamentItem.executeUpdate();
                ResultSet generatedKeys = stamentItem.getGeneratedKeys();
                if(generatedKeys.next()){
                    id = generatedKeys.getInt(1);
                }
                if(id != 0){
                    stament = dbhelp.conn.prepareStatement(Query);
                    stament.setInt(1, id);
                    stament.setString(2, category);
                    stament.executeUpdate();
                    return true;
                    }
                else{
                    return false;
                }
            } 
            catch (SQLException e) {
                System.out.print("ERROR");
                System.out.print(e.getMessage());
                return false;
            } finally {
                if (stament != null) {
                    stament.close();
                }
            }
            
        } 
        return false;
    }
    
    
}
