
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
public class DBOracleAdmin {
    
    private static String     OdriverClassName = "oracle.jdbc.OracleDriver" ;
    private static String     Ourl = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    private static Connection OdbConnection = null;
    private static String     Ousername = "";
    private static String     Opasswd = "";
    private static Statement  Ostatement = null;
    private static ResultSet  Ors = null;

    public DBOracleAdmin(String Ousername,String Opasswd) {
        this.Ousername = Ousername;
        this.Opasswd = Opasswd;
        
        
    }

    Statement connectToDB(){
        try {
            Class.forName (OdriverClassName);
            OdbConnection = DriverManager.getConnection (Ourl, Ousername, Opasswd);
            Ostatement    = OdbConnection.createStatement();
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Den egine sindesi");
        }
             
        return Ostatement;
    }
    // {Start of} Getters
    Statement getStatement(){
        return Ostatement;
    }

    Connection getConnection() {
        return OdbConnection;
    }
    
    
    PreparedStatement getPrepareStatement(){
        return;
    }
    
    ResultSet getResultSet(){
        return ;
    }
    // {End of} Getters
    
    
    
    void closeit(){
        try {
            OdbConnection.close();
        } catch (Exception e) {
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
