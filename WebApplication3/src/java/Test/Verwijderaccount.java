package Test;

import java.sql.*;
import java.util.*;
import java.util.Date;
import javax.servlet.http.HttpSession;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gebruiker
 */
public class Verwijderaccount {
    private String Naam;
   
 
    

    public Verwijderaccount(String naam) {
        this.Naam = naam;
   
    }

    public boolean Verbind() throws Exception {
        Databaseconnector ts = new Databaseconnector();
        if (ts.verbindmetDatabase()) {
            PreparedStatement state = null;
            try {
            
                String q = "UPDATE GEBRUIKER SET ACTIEF = 0 WHERE EMAIL =?";
                //String q = "INSERT INTO GEBRUIKER (EMAIL,WACHTWOORD, VOORNAAM, TUSSENVOEGSEL, ACHTERNAAM) VALUE( ?, ?, ? , ? ,?)";
                state = ts.conn.prepareStatement(q);
                state.setString(1, Naam);
               
                
                
                //state.executeQuery();
                state.executeUpdate();
              
            } catch (SQLException e) {
                return false;
            } finally {
                if (state != null) {
                    state.close();
                }
            }
        }
        return true;
    }    
}

