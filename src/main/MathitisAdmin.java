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
public class MathitisAdmin {
    private static int sid = 1;
    
    public MathitisAdmin() {
        
        createTable();
        insertToMathitis();
        
        
    }

    public static int getSid() {
        return sid;
    }

    public static void setSid(int sid) {
        MathitisAdmin.sid = sid;
    }
        
    
    
    
    
    
    
    
    private void createTable(){
        Statement aStatePG = DBPostresqlAdmin.getStatement(); 
        String query1 = "CREATE TABLE mathitis(\n" +
               "sid SERIAL NOT NULL,\n" +
               "onoma varchar(50) NOT NULL,\n" +
               "eponymo varchar(50) NOT NULL,\n" +
               "onPateras varchar(20) NOT NULL,\n" +
               "onMiteras varchar(20) NOT NULL,\n" +
               "etosEisagogis int NOT NULL,\n" +
               "PRIMARY KEY(sid)\n" +
               ");";
        try {
            aStatePG.executeUpdate(query1);
        } catch (Exception e) {
            System.out.println("StudentAdmin.java " + e.getMessage() );
        }
    }
    
    private void insertToMathitis(){
        
        String insertQuery = "INSERT INTO mathitis( onoma, eponymo, onPateras, "
                + "onMiteras, etosEisagogis) VALUES ( ?, ?, ?, ?, ?);";
        
        PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(insertQuery);
        
        
        String[] onoma = {"Δημητρα",        "Ολίβια",       "Χρυσάνθη", "Παναγιώτα",    "Βασίλης",      "Νίκος",        "Γιώργος",  "Παύλος"};
        String[] eponymo = {"Μολώνη",       "Σουλίωτη",     "Αποσκίτη", "Μπόμπορη",     "Βασιλείου",    "Νίκας",        "Γεωργίου", "Παύλου"};
        String[] onPatera = {"Νίκος",       "Πέτρος",       "Δημήτρης", "Βαγγέλης",     "Νικιτα",       "Παρασευάς",    "Δημήτρης", "Βρασίδας"};
        String[] onMhteras = {"Αναστασία",  "Νίκη",         "Ελένη",    "Δανάη",        "Ευταξία",      "Ελισάβετ",     "Μαρία",    "Μελπομένη"};
        int[] etosEisagogis = {2015,         2017,          2019,        2018,          2018,           2019,           2015,       2015};
        
        try {
            for(int i =0; i < 8; i++ ){
                sid++;
                aStatePG.setString(1, onoma[i]);
                aStatePG.setString(2, eponymo[i]);
                aStatePG.setString(3, onPatera[i]);
                aStatePG.setString(4, onMhteras[i]);
                aStatePG.setInt(5, etosEisagogis[i]);
                aStatePG.executeUpdate();
            }
        } catch (Exception e) {
        }
    }
    
    static void addNewStudent(String onoma, String eponymo, String onomaPatera, String onomaMiteras, Object etosEisagwgis){

            String addQuery = "SELECT insertmathitis(?,?,?,?,?)";

            try {
                PreparedStatement aStatePG = DBPostresqlAdmin.getPrepareStatement(addQuery);
                String etos = String.valueOf(etosEisagwgis);
                int etosk = Integer.valueOf(etos);
                    sid++;
                    aStatePG.setString(1, onoma);
                    aStatePG.setString(2, eponymo);
                    aStatePG.setString(3, onomaPatera);
                    aStatePG.setString(4, onomaMiteras);
                    aStatePG.setInt(5, etosk);
                    aStatePG.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Η καταχωρηση ολοκληρωθηκε επιτυχώς", 
                        "Ενημέρωση", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Η καταχωρηση δεν ολοκληρωθηκε επιτυχώς /n"+e.getMessage() , 
                        "Ενημέρωση", JOptionPane.WARNING_MESSAGE);
            }
    
    }
    
       
    
    
    
    
    
    
}
