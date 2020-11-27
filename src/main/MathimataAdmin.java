/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Statement;

/**
 *
 * @author alexa
 */

public class MathimataAdmin {
    static int sid = 1;

    public MathimataAdmin() {
        
        createTable();
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    private void createTable(){
        
        Statement aStatePG = DBPostresqlAdmin.getStatement();
        
        String query3 = "CREATE TABLE mathima(\n" +
                "mid int NOT NULL,\n" +
                "Kid INT NOT NULL,\n" +
                "mathima varchar(20),\n" +
                "PRIMARY KEY(mid),\n" +
                "FOREIGN KEY (kid) REFERENCES kathigitis(kid)\n" +
                ");";
        
        try {aStatePG.executeUpdate(query3);} catch (Exception e) {System.out.println("Create table : " + e.toString());}
        
    }
}
