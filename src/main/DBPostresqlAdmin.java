package main;


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
    private static String       driverClassName = "org.postgresql.Driver";
    private static String       url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/";
    private static Connection   dbConnection = null;
    private static String       username = "";
    private static String       passwd = "";
    private static Statement    statement = null;
    private static ResultSet    rs = null;
    private static PreparedStatement preparedStatement;

    public DBPostresqlAdmin(String Pusername, String Ppasswd) {
        this.username = Pusername;
        this.passwd = Ppasswd;
        url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/" + Pusername;
    }

    public DBPostresqlAdmin() {
    }
    
    static Connection connectToDB(){
        try {
            Class.forName (driverClassName);
            dbConnection = DriverManager.getConnection (url, username, passwd);
            statement    = dbConnection.createStatement();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println("Den egine sindesi");
        }
             
        return dbConnection;
    }
    // {Start of} Getters
     
     
    static Connection getConnection() {
        return dbConnection;
    }
    static boolean isConnected(){
        
        return (dbConnection != null);
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
            System.out.println("Kati piges lathos sto preparedStatement");
        }
        return preparedStatement;
        
    }    
    
    static String getUsername(){
        return username;
    }
    static String getPassword(){
        return passwd;
    }
    
    // {End of} Getters
    
    
    
    
    
    
    
    
    
    
    
    static boolean closeit(){
        try {
            if(statement != null){
                statement.close();
                System.out.println("Εκλεισε το ProstgreSQL Statement");
            }
                
            
            if(dbConnection != null){
                dbConnection.close();
                System.out.println("Εκλεισε το ProstgreSQL Connection");
                dbConnection = null;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
