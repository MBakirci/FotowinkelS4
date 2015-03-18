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
public class Login {

    private String Naam;
    private String Wachtwoord;

    public Login(String naam, String wachtwoord) {
        this.Naam = naam;
        this.Wachtwoord = wachtwoord;
    }

    public boolean Verbind() throws Exception {
        Test.Databaseconnector ts = new Test.Databaseconnector();
        if (ts.verbindmetDatabase()) {
            PreparedStatement state = null;
            try {
                String q = "Select WACHTWOORD from Gebruiker where EMAIL = ?";
                state = ts.conn.prepareStatement(q);
                state.setString(1, Naam);
                //state.executeQuery();
                ResultSet rs = state.executeQuery();
                if (rs.next()) {
                    if(Wachtwoord.equals(rs.getString("WACHTWOORD"))){
                        return true;                        
                    }
                    return false;
                }
            } catch (SQLException e) {
                return false;
            } finally {
                if (state != null) {
                    state.close();
                }
            }
        }
        return false;
    }    
}

