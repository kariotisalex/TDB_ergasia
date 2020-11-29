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
public class VathmologiaAdmin {
    
    static int sid = 1;
    
    
    public VathmologiaAdmin() {
        createTable();
        
        
    }
    
    
    
    
    private void createTable(){
        Statement aStatePG = DBPostresqlAdmin.getStatement();

        String query4 = "CREATE TABLE vathmologia(\n" +
                        "sid int NOT NULL, \n" +
                        "mid int NOT NULL, \n" +
                        "vathmos int,\n" +
                        "etos varchar(50),\n" +
                        "FOREIGN KEY (sid) REFERENCES mathitis(sid),\n" +
                        "FOREIGN KEY (mid) REFERENCES mathima(mid)\n" +
                        ");";
        
        try {aStatePG.executeUpdate(query4);} catch (Exception e) {System.out.println("Create table : " + e.toString());}
    }
    
        
}
