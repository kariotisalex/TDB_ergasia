
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
    
    private static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    private static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    private static Connection dbConnection = null;
    private static String     username = "";
    private static String     passwd = "";
    private static Statement  statement = null;
    private static ResultSet  rs = null;
    private static PreparedStatement preparedStatement;

    public DBOracleAdmin(String Ousername,String Opasswd) {
        this.username = Ousername;
        this.passwd = Opasswd;
        
        
    }

    Statement connectToDB(){
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
    
    Connection getConnection() {
        return dbConnection;
    }
    
    Statement getStatement(){
        return statement;
    }
    
    ResultSet getResultSet(){
        return rs;
    }
    
    PreparedStatement getPrepareStatement(){
        return preparedStatement;
    }
    

    // {End of} Getters
    
    
    
    void closeit(){
        try {
            dbConnection.close();
        } catch (Exception e) {
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
