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

    //email

    private String Naam;

    //constructor
    public Verwijderaccount(String naam) {
        this.Naam = naam;

    }

    //methode die de status op nonactief zet

    public boolean Zetstatusnonactief() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //db connectie maken
        Databaseconnector ts = new Databaseconnector();
        if (ts.verbindmetDatabase()) {
            PreparedStatement state = null;
            PreparedStatement state1 = null;

            try {
                String a = "Select EMAIL FROM GEBRUIKER WHERE EMAIL = ?";
                state1 = ts.conn.prepareStatement(a);
                state1.setString(1, Naam);
                ResultSet rs = state1.executeQuery();

                while (rs.next()) {
                    //prepared sql statement die status op non actief zet
                    String q = "UPDATE GEBRUIKER SET ACTIEF = 0 WHERE EMAIL =?";
                    //String q = "INSERT INTO GEBRUIKER (EMAIL,WACHTWOORD, VOORNAAM, TUSSENVOEGSEL, ACHTERNAAM) VALUE( ?, ?, ? , ? ,?)";
                    state = ts.conn.prepareStatement(q);
                    state.setString(1, Naam);

                    //state.executeQuery();
                    state.executeUpdate();
                    return true;

                }

            } catch (SQLException e) {
                //mislukt en toont error msg op screen
                System.out.print("email bestaat al");
                return false;
            } finally {
                //closed altijd de state
                if (state != null) {
                    state.close();
                }
            }
        }

        return false;
    }

    public boolean Zetstatusactief() throws Exception {
        //database connectie wordt opgezet
        Databaseconnector ts = new Databaseconnector();
        if (ts.verbindmetDatabase()) {
            PreparedStatement state = null;
            PreparedStatement state1 = null;
            try {
                String a = "Select EMAIL FROM GEBRUIKER WHERE EMAIL = ?";
                state1 = ts.conn.prepareStatement(a);
                state1.setString(1, Naam);
                ResultSet rs = state1.executeQuery();

                while (rs.next()) {
                    //status weer naar actief zetten
                    String q = "UPDATE GEBRUIKER SET ACTIEF = 1 WHERE EMAIL =?";
                    //String q = "INSERT INTO GEBRUIKER (EMAIL,WACHTWOORD, VOORNAAM, TUSSENVOEGSEL, ACHTERNAAM) VALUE( ?, ?, ? , ? ,?)";
                    state = ts.conn.prepareStatement(q);
                    state.setString(1, Naam);

                    //state.executeQuery();
                    state.executeUpdate();
                    return true;
                    // return true als het gelukt is
                }

            } catch (SQLException e) {
                // als het mislukt is toon dan de error message op het scherm
                System.out.print(e.toString());
                return false;
            } finally {
                //close de state
                if (state1 != null) {
                    state1.close();
                }
                if (state != null) {
                    state.close();
                }
            }
        }
        return false;
    }
}