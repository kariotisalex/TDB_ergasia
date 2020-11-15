
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
public class DBPostresqlAdmin {
    private static String PdriverClassName = "org.postgresql.Driver";
    private static String Purl = "jdbc:postgresql://dblabs.it.teithe.gr:5432/";
    private static Connection PdbConnection = null;
    private static String Pusername = "";
    private static String Ppasswd = "";
    private static Statement Pstatement = null;
    private static ResultSet Prs = null;

    public DBPostresqlAdmin(String Pusername, String Ppasswd) {
        this.Pusername = Pusername;
        this.Ppasswd = Ppasswd;
        Purl = "jdbc:postgresql://dblabs.it.teithe.gr:5432/"+ Pusername;
    }
    
     Statement connectToDB(){
         
        try {
            Class.forName (PdriverClassName);
            PdbConnection = DriverManager.getConnection (Purl, Pusername, Ppasswd);
            Pstatement    = PdbConnection.createStatement();
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Den egine sindesi");
        }
             
        return Pstatement;
    }
    
    Statement getStatement(){
        return Pstatement;
    }
    
    
        void closeit(){
        try {
            PdbConnection.close();
        } catch (Exception e) {
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
