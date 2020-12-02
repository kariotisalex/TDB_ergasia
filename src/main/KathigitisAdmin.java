/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class KathigitisAdmin {
    private static int kid = 1;

    public static void setKid(int kid) {
        KathigitisAdmin.kid = kid;
    }

    public KathigitisAdmin() {
        createTable();
        insertToKathigitis();
        
        
    }
    
    
    
    private void createTable(){
        Statement aStatePG = DBPostresqlAdmin.getStatement();

        String query2 = "CREATE TABLE kathigitis(\n" +
                "kid int NOT NULL, \n" +
                "onoma_kathigiti varchar(20),\n" +
                "epitheto_kathigiti varchar(20), \n" +
                "eidikotita varchar(20),\n" +
                "PRIMARY KEY(kid)\n" +
                ");";
        
        
        try {aStatePG.executeUpdate(query2);} catch (Exception e) {System.out.println("Create table : " + e.toString());}

    }
    
    private void insertToKathigitis(){
        
        String insertQuery = "INSERT INTO kathigitis(kid, Onoma_kathigiti, Epitheto_kathigiti, Eidikotita"
                + ") VALUES (?, ?, ?, ?);";
        
        PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(insertQuery);
        
        
        String[] onoma      =    {"Γιωργος",    "Νικος", "Ανδρέας",    "Βικη",       "Χρηστος",   "Γιωργος",     "Ηλίας",       "Παυλος"};
        String[] eponymo    =    {"Γεωργίου",   "Νικας", "Πλιατσιδης", "Σαρτζετακη", "Σαμαράς",   "Ματζουρανης", "Τζακοπουλος", "Καρυπιδης"};
        String[] eidikotita =    {"Μαθηματικο", "Χημικο","Φιλολογία",  "Γυμναστικη", "Φιλολογια", "Μαθηματικο",  "Φυσικό",      "Πληροφορικη"};
        
        
        try {
            for(int i =0; i < 8; i++ ){
                aStatePG.setInt(1,kid++);
                aStatePG.setString(2, onoma[i]);
                aStatePG.setString(3, eponymo[i]);
                aStatePG.setString(4, eidikotita[i]);
                aStatePG.executeUpdate();
            }
        } catch (Exception e) {
        }
    }
    
    static void addNewTeacher(String onoma,String epitheto, String eidikotita){
        String addQuery = "INSERT INTO kathigitis(kid, Onoma_kathigiti, Epitheto_kathigiti, Eidikotita"
                + ") VALUES (?, ?, ?, ?);";

            try {
                PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(addQuery);
                
                    aStatePG.setInt(1,kid++);
                    aStatePG.setString(2, onoma);
                    aStatePG.setString(3, epitheto);
                    aStatePG.setString(4, eidikotita);
                    aStatePG.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Η καταχωρηση ολοκληρωθηκε επιτυχώς", 
                        "Ενημέρωση", JOptionPane.INFORMATION_MESSAGE);
                    


                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Η καταχωρηση δεν ολοκληρωθηκε επιτυχώς /n"+e.getMessage() , 
                        "Ενημέρωση", JOptionPane.WARNING_MESSAGE);
            }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
