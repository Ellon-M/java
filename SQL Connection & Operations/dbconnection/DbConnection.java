/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import java.sql.*;      // needed SQL library
/**
 *
 * @author ellon
 */

// connection class
public class DbConnection {
    
    // defining the method that will connect to our mySQL database
    
    // a connection session with our database
    public Connection connect() {
        Connection db_connect = null;
        String hostname = "localhost";
        String database = "students_DB";
        String username = "root";
        String password = "LilacSkies@112";     // password goes here
        
    // JDBC
    // This is a java API that connects us to the database by using drivers..
    // The JDBC driver gives out the connection to the database and implements 
    // the protocol for transferring the query and result between client and database.
    
    // Checking to see if our JDBC driver is working 
    try {
    Class.forName("com.mysql.jdbc.Driver");
    
    // print a success message to console for confirmation
    
    System.out.println("Driver loaded successfully");
    
   } catch(ClassNotFoundException cnfe) {
       
    // else print an error message when an exception is caught 
       
    System.out.println("Error loading driver: " + cnfe ); 
       
   }
    
    // Checking to see if our connection is established
     try {  
    
    // Set up the connection to our database
    db_connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_DB","root", "");
    
    // print out a success messsage if connection is established 
    
    System.out.println("Connection to DB established");
    
    } catch(SQLException sqle) {
                
    //else print an error message if connection is unsuccessful
    
    System.out.println("Error establishing connection: " +sqle);
}
     // return our connection
    return db_connect;
}
}
