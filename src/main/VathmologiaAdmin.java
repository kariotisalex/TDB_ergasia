/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;

/**
 *
 * @author alexa
 */
public class VathmologiaAdmin {
    
    static int sid = 1;
    
    
    public VathmologiaAdmin() {
        createTable();
        insertToVathmologia();
        
    }
    
    
    
    
    private void createTable(){
        Statement aStatePG = DBPostresqlAdmin.getStatement();

        String query4 = "CREATE TABLE vathmologia(\n" +
                        "sid int NOT NULL, \n" +
                        "mid int NOT NULL, \n" +
                        "vathmos int,\n" +
                        "eksamino int,\n" +
                        "etos int,\n" +
                        "FOREIGN KEY (sid) REFERENCES mathitis(sid),\n" +
                        "FOREIGN KEY (mid) REFERENCES mathima(mid)\n" +
                        ");";
        
        try {aStatePG.executeUpdate(query4);} catch (Exception e) {System.out.println("Create table : " + e.toString());}
    }
    

    private void insertToVathmologia(){
        
        String insertQuery = "INSERT INTO vathmologia(sid, mid, vathmos, eksamino, etos"
                + ") VALUES (?, ?, ?, ?, ?);";
        
        PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(insertQuery);
        
        
            int[] sid      =  {  1,    1,    2,    4,    2,    2,    2,    2,    2    };
            int[] mid      =  {  1,    1,    3,    4,    3,    4,    2,    4,    4    };
            int[] vathmos  =  {  7,    9,    7,    8,    5,    3,    15,   10,   20    };
            int[] eksamino =  {  1,    2,    1,    2,    2,    1,    1,    2,    3   };
            int[] etos     =  { 2020, 2020, 2019, 2015, 2019, 2015, 2020, 2015, 2015 };
        
        
        try {
            for(int i =0; i < 9; i++ ){
                aStatePG.setInt(1,sid[i]);
                aStatePG.setInt(2, mid[i]);
                aStatePG.setInt(3, vathmos[i]);
                aStatePG.setInt(4, eksamino[i]);
                aStatePG.setInt(5, etos[i]);
                aStatePG.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
       static void addNewVathmologia(int sid, int mid, int vathmos, int eksamino, int etos){
        
        
        
        
        String insertQuery = "INSERT INTO vathmologia(sid, mid, vathmos, eksamino, etos"
                           + ") VALUES (?, ?, ?, ?, ?);";
        
        PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(insertQuery);
        
        try {
            
            aStatePG.setInt(1,sid);
            aStatePG.setInt(2, mid);
            aStatePG.setInt(3, vathmos);
            aStatePG.setInt(4, eksamino);
            aStatePG.setInt(5, etos);
            aStatePG.executeUpdate();
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }

        
        
    } 
    
    
    
    
    
}
