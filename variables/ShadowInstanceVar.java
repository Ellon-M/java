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
public class ShadowInstanceVar {
    // occurs when when a parameter variable or a local variable 
    // is defined inside an instance method and has the same name as an instance variable
    
   public static double n;  //shadowed
   public static int i;     //shadowed
   
   public void add(double n){
       this.n+= n;          // This adds the value of n in the parameter variable, to the value of n in the instance variable.
                            // The implicit parameter this, is used to differenciate between the 2...
                            // variables with the same name, and avoids shadowing problems.
                            // By saying this.n, we are calling the parameter variable by its full name, hence the specificity..
                            // overcomes the confusion between the two variables.
   }
   
   // same thing different method
   public void subtract(int i){
       this.i = this.i + i;
   }  
}

