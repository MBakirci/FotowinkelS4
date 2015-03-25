/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.List;

/**
 *
 * @author Coen
 */
public class Categorie {
    int id;
    String naam;
    int parrent;
    List<Integer> childs;

    public Categorie(int id, String naam){
        this.id = id;
        this.naam = naam;
    }

    public int GetId(){
        return id;
    }
    
    public String GetNaam(){
        return naam;
    }
}
