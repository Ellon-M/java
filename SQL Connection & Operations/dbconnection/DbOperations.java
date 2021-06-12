/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import java.sql.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ellon
 */


// Our database operations and execution of queries
 
public class DbOperations {
      DbConnection dbconnect = new DbConnection();
        Connection connect = dbconnect.connect(); 
        
        // A Statement is an interface that represents a SQL statement
        PreparedStatement pst;   // useful when we want to execute a statement object many times
        
        // The ResultSet interface provides methods 
        // for retrieving and manipulating the results of executed queries.. adn the result set object
        // maintains a cursor that points to the current row in the result set. 
        //The term "result set" refers to the row and column data contained in a ResultSet object.

        ResultSet rs;


// our insert method - inserting rows into our database table
   public void insert(String id, String name, String course){
       
       // inserting a row
       
       // the missing values are inserted from the main class
       // Adding parameters into our SQL statement using placeholders in the form of question marks (?)
       // -helps us avoid SQL injection.
     
        String insertQuery = "INSERT INTO `student`(student_id, student_name, student_course)\n" + "VALUES(?,?,?)";
        
       //  
        try { 
             pst = connect.prepareStatement(insertQuery); 
               pst = connect.prepareStatement(insertQuery);
                pst.setString(1, id);
                pst.setString(2, name);
                pst.setString(3, course);
                
                // a method to execute the insert statement
                pst.executeUpdate();
                
                // print a success message to the console to confirm that our execution worked
                System.out.println("New student added!");
            
        } catch (SQLException ex){
            
                // else, print an error message if an exception is caught
                System.out.println("Statement could not be created and executed"+ex);
     }
        
       
   }
        public void select(){
            
            // selecting a row
            
               String selectQuery = "SELECT `student_name` FROM `student` WHERE `student_id` = 137177";
              
               
                try (Statement pst = connect.prepareStatement(selectQuery)) {
                     ResultSet rs = pst.executeQuery(selectQuery);
                     
                    // get the student selcted from the table as a string
                    // the Result Set interface provides getter methods for retreiving column values for the selected row
                    // the 1 is the index of the row we want to return
                    
                    if (rs.next()) {
                       String Student = rs.getString(1);  
                       
                    // print the output of the selected student's name to confirm   
                        System.out.println("The student's name is: " + Student);
                } 
                
                } catch (SQLException ex) {
                    
                    // else print an error message if an exception is caught
                System.out.println("Error occured: "+ex);
            }
    }
        
        public void update(){
        
            // updating a row
            String updateQuery = "UPDATE `student` SET `student_course`= 'ICS' WHERE `student_id` = 137177";
            
            // selecting the updated row
            String selectQuery = "SELECT `student_course` FROM `student` WHERE `student_id` = 137177";
            
            try (Statement pst = connect.prepareStatement(updateQuery)) {
                
                // executing the update
                pst.executeUpdate(updateQuery);
                ResultSet rs = pst.executeQuery(selectQuery);
               if (rs.next()) {
                       String Course = rs.getString(1); 
                       // print the output of the updated student's course to confirm   
                        System.out.println("The student's course is: " + Course);
                } 
                
            } catch (SQLException ex) {
                       // else print an error message if an exception is caught
                System.out.println("Error occured: "+ex);
            }
        }
        
          
    public void delete(){
                
                // deleting the newly inserted student from the table
                String updateQuery = "DELETE from `student` WHERE `student_id` = 137340"; 
        
               try (Statement pst = connect.prepareStatement(updateQuery)) {
                pst.executeUpdate(updateQuery);
               
                // print a success message if the entry is deleted successfully
                System.out.println("Row deleted successfully");
                
               } catch (SQLException ex) {
                // else print an error message if an exception is caught   
                System.out.println("Error occured: "+ex);
             }  
    }
   
}

