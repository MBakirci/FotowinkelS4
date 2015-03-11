package Test;


import java.sql.*;
import java.util.logging.*;


/**
 *
 * @author Jesper
 */
public final class Databaseconnector  
{
    /**
     * connectie variabelen
     */
    protected Connection conn;
    /**
     * constructor
     */
    protected Databaseconnector() 
    {
        try {
            this.verbindmetDatabase();
        } catch (ClassNotFoundException | InstantiationException | SQLException | IllegalAccessException ex) {
            Logger.getLogger(Databaseconnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       /**
        * hier maken wij een verbinding in de database
        * @throws ClassNotFoundException exeptions
        * @throws InstantiationException exeptions
        * @throws SQLException exeptions
        * @throws IllegalAccessException exeptions
        */
    protected void verbindmetDatabase() throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException
    {
        String url = "fhictora01.fhict.local";
        String dbName = "fotowinkel";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "dbi296880"; 
        String password = "U4XAsfWbUp";
        
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url+dbName,userName,password);
        
        if (conn != null) {
		System.out.println("You made it, take control your database now!");
	} else {
		System.out.println("Failed to make connection!");
	}
    }
    /**
     * methode voor het verbreken van de database
     */
    protected void verbindingverbrekenmetDatabase() 
    {
        try 
        {
            conn.close();
            conn = null;
        } 
        catch (SQLException ex) 
        {
            System.err.println(ex.getMessage());
        }
    }

    public void close()
    {
        this.verbindingverbrekenmetDatabase();
    }
}