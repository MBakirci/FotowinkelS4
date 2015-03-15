/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Dennis
 */
public class AccountInfo {
    
    private String Email;
    private String TelNr;
    private String Pass;
    private String PassVer;
    private String Fname;
    private String Lname;
    private String Address;
    private String City;
    
    public AccountInfo(String email, String telnr, String pass, String passver, String fname, String lname, String address, String city)
    {
        Email = email;
        TelNr = telnr;
        Pass = pass;
        PassVer = passver;
        Fname = fname;
        Lname = lname;
        Address = address;
        City = city;
    }
    
    public void getDBInfo()
    {
        //get existing info
    }
    public void changeAccountInfo()
    {
        //add to DB
        System.out.print("been here");
    }
    
    
    
    
}
