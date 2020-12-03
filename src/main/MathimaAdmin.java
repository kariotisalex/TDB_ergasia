/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author alexa
 */

public class MathimaAdmin {
    private static int mid = 1;

    public MathimaAdmin() {
        
        createTable();
        insertToMathima();
        
        
        
    }

    public static void setMid(int mid) {
        MathimaAdmin.mid = mid;
    }
    
    private void createTable(){
        
        Statement aStatePG = DBPostresqlAdmin.getStatement();
        
        String query3 = "CREATE TABLE mathima(\n" +
                "mid int NOT NULL,\n" +
                "kid INT NOT NULL,\n" +
                "onoma_mathimatos varchar(20),\n" +
                "PRIMARY KEY(mid),\n" +
                "FOREIGN KEY (kid) REFERENCES kathigitis(kid)\n" +
                ");";
        
        try {aStatePG.executeUpdate(query3);} catch (Exception e) {System.out.println("Create table : " + e.toString());}
        
    }
    
    private void insertToMathima(){
        
        String insertQuery = "INSERT INTO mathima(mid, kid, onoma_mathimatos"
                + ") VALUES (?, ?, ?);";
        
        PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(insertQuery);
        
        
            int[] kid     =  { 1 ,5 ,3 ,4 ,6 ,2 ,7 ,8 };
        String[] mathima  =    {"Αλγεβρα", "Αρχαία", "Εκθεση", "Γυμναστική", "Γεωμετρία", "Χημέια", "Φυσική", "Πληροφορική"};

                                                                                                                                 
        
        
        try {
            for(int i =0; i < 8; i++ ){
                aStatePG.setInt(1,mid++);
                aStatePG.setInt(2, kid[i]);
                aStatePG.setString(3, mathima[i]);
                aStatePG.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
