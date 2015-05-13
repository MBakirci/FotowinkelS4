/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Test.Databaseconnector;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.io.*;
import java.util.*;
import oracle.jdbc.OracleTypes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffrey
 */
public class Foto_klant {
        public ArrayList<String> Vraagcode(String Email) throws Exception {
        Databaseconnector ts = new Databaseconnector();
               ArrayList Codes = new ArrayList();
              CallableStatement state = null;
              String code = "{call GETCODE(?,?)}";
              ResultSet rs = null;
        if (ts.verbindmetDatabase()) {

            try {
               state = ts.conn.prepareCall(code);
               
               state.setString(1, Email);
               state.registerOutParameter(2, OracleTypes.CURSOR);
               
                //state.executeQuery();
                state.execute();
                
                rs = (ResultSet)state.getObject(2);
                while (rs.next()){
                String Unique_Code = rs.getString("UNIQUECODE");
                Codes.add(Unique_Code);
            }
                 return Codes;
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                rs.close();
                    state.close();
                    ts.conn.close();
                }
            }
        return null;
    }   
        
           public String VraagFoto(String Code) throws Exception {
        Databaseconnector ts = new Databaseconnector();
              CallableStatement state;
              String Fotocode  ="";
              String code = "{call GETFOTO(?,?)}";
        if (ts.verbindmetDatabase()) {

            try {
               state = ts.conn.prepareCall(code);
               
               state.setString(1, Code);
               state.registerOutParameter(2, java.sql.Types.VARCHAR);
               
                //state.executeQuery();
                state.execute();
                
                Fotocode = state.getString(2);
                  state.close();
                    ts.conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                
                }
            }
        
            return Fotocode;
    }
           
}

