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
                "kid SERIAL NOT NULL, \n" +
                "onoma_kathigiti varchar(20),\n" +
                "epitheto_kathigiti varchar(20), \n" +
                "eidikotita varchar(20),\n" +
                "PRIMARY KEY(kid)\n" +
                ");";
        
        
        try {aStatePG.executeUpdate(query2);} catch (Exception e) {System.out.println("Create table : " + e.toString());}

    }
    
    
    
    private void insertToKathigitis(){
        
        String insertQuery = "INSERT INTO kathigitis( Onoma_kathigiti, Epitheto_kathigiti, Eidikotita"
                + ") VALUES (?, ?, ?);";
        
        PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(insertQuery);
        
        
        String[] onoma      =    {"Γιωργος",    "Νικος", "Ανδρέας",    "Βικη",       "Χρηστος",   "Γιωργος",     "Ηλίας",       "Παυλος"};
        String[] eponymo    =    {"Γεωργίου",   "Νικας", "Πλιατσιδης", "Σαρτζετακη", "Σαμαράς",   "Ματζουρανης", "Τζακοπουλος", "Καρυπιδης"};
        String[] eidikotita =    {"Μαθηματικό", "Χημικό","Φιλολογία",  "ΚΦΑ",        "Φιλολογία", "Μαθηματικό",  "Φυσικό",      "Πληροφορική"};
        
        
        try {
            for(int i =0; i < 8; i++ ){
                kid++;
                aStatePG.setString(1,onoma[i]);
                aStatePG.setString(2, eponymo[i]);
                aStatePG.setString(3, eidikotita[i]);
                aStatePG.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("insertToKathigitis : " +e.getMessage());
        }
    }
    
    static void addNewTeacher(String onoma,String epitheto, String eidikotita){
        String addQuery = "INSERT INTO kathigitis( Onoma_kathigiti, Epitheto_kathigiti, Eidikotita"
                + ") VALUES ( ?, ?, ?);";

            try {
                PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(addQuery);
                    kid++;
                    aStatePG.setString(1,onoma);
                    aStatePG.setString(2, epitheto);
                    aStatePG.setString(3, eidikotita);
                    aStatePG.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Η καταχωρηση ολοκληρωθηκε επιτυχώς", 
                        "Ενημέρωση", JOptionPane.INFORMATION_MESSAGE);
                    


                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Η καταχωρηση δεν ολοκληρωθηκε επιτυχώς /n"+e.getMessage() , 
                        "Ενημέρωση", JOptionPane.WARNING_MESSAGE);
                System.out.println("addNewTeacher : "+e.getMessage());
            }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
