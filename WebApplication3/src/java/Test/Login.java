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
        Databaseconnector ts = new Databaseconnector();
        if (ts.verbindmetDatabase()) {
            PreparedStatement state = null;
             PreparedStatement state1 = null;
            try {
                String a = "Select EMAIL FROM GEBRUIKER WHERE EMAIL = ?";
                state1 = ts.conn.prepareStatement(a);
                state1.setString(1, Naam);
                ResultSet rs1 = state1.executeQuery();
                if(rs1.next()){
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

