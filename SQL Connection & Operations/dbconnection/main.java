/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

/**
 *
 * @author ellon
 */
public class main {
     public static void main(String[] args) {
        DbConnection connection = new DbConnection();
        connection.connect();
        
        // Operations from DbOperations class
        DbOperations dbo = new DbOperations();
        dbo.insert("137177","Ellon Mordecai","DBIT"); 
        dbo.select();
        dbo.update();
        dbo.delete();
        
     }
     }




     