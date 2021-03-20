/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author ellon
 */
public class ClassVariables {
 
    // class variable definition:
        // - static variables within a class but outside of a method
        // - mostly use the public access modifier
        // - MUST use the keyword static.  (Note: Once you omit this keyword you will have defined an instance variable!)
        
    // Class variables are used to store long term information that is used by many different methods in the program. 
   
    // define a static/class variable:
    public static double p;
    public static int i;
    
    
    public static void main(String[] args) {
    // accessing class variables
    // class variables can be accessed by their full complete name
    // or by short hand notation
    ClassVariables.p = 3.1415;
    ClassVariables.i = 30;
    p = 3.1415;
    i = 30;
    
        System.out.println("Class variable: " + p );
        System.out.println("Class variable: " + i );
    }
    
    
    // created when the program begins and destroyed when the program terminates
    // exist for the entire execution of the program
    // accessible in every method of every class
    
}
