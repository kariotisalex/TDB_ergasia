
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
    private static String driverClassName = "org.postgresql.Driver";
    private static String url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/";
    private static Connection dbConnection = null;
    private static String username = "";
    private static String passwd = "";
    private static Statement statement = null;
    private static ResultSet rs = null;
    private static PreparedStatement preparedStatement;

    public DBPostresqlAdmin(String Pusername, String Ppasswd) {
        this.username = Pusername;
        this.passwd = Ppasswd;
        url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/"+ Pusername;
    }
    
    static Statement connectToDB(){
        try {
            Class.forName (driverClassName);
            dbConnection = DriverManager.getConnection (url, username, passwd);
            statement    = dbConnection.createStatement();
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Den egine sindesi");
        }
             
        return statement;
    }
    // {Start of} Getters
     
     
    static Connection getConnection() {
        return dbConnection;
    }
     
    static Statement getStatement(){
        return statement;
    }
    
    static ResultSet getResultset(){
        return rs;
    }
    
    static PreparedStatement getPrepareStatement(String ps){
        try {
            preparedStatement = dbConnection.prepareStatement(ps);
        } catch (Exception e) {
        }
        return preparedStatement;
        
    }    
    
    
    
    
    
    // {End of} Getters
    
    
    static void closeit(){
        try {
            statement.close();
            dbConnection.close();
        } catch (Exception e) {
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
