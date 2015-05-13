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
public class registreer {
    private String Naam;
    private String Wachtwoord;
    private String Voornaam;
    private String Tussenvoegsel;
    private String Achternaam;
    private boolean Atype;
    private int Id;
    private int Enabled;

    public registreer(String naam, String wachtwoord, String voornaam, String tussenvoegsel, String achternaam, int actief,boolean type ) {
        this.Naam = naam;
        this.Wachtwoord = wachtwoord;
        this.Voornaam = voornaam;
        this.Tussenvoegsel = tussenvoegsel;
        this.Achternaam = achternaam;
        this.Enabled = actief;
        this.Atype = type;
        
    }

    public boolean Verbind() throws Exception {
        Databaseconnector ts = new Databaseconnector();
        if (ts.verbindmetDatabase()) {
            PreparedStatement state = null;
            try {
                String q = "INSERT INTO FW_ACCOUNT (EMAIL,WACHTWOORD, ENABLED, VOORNAAM, TUSSENVOEGSEL, ACHTERNAAM, ATYPE) VALUES(? ,?, ?, ?, ? , ?,?)";
                state = ts.conn.prepareStatement(q);
                state.setString(1, Naam);
                state.setString(2, Wachtwoord);
                Enabled = 1;
                state.setInt(3, Enabled);
                state.setString(4, Voornaam);
                state.setString(5, Tussenvoegsel);
                state.setString(6, Achternaam);
                String soort = "fotograaf";
                if(Atype == true)
                { soort = "klant";}
                state.setString(7, soort);
                
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

