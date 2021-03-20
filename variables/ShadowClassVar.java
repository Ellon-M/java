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
public class ShadowClassVar {
    // when a method has a local variable / parameter variable defined in a scope,
    // whose name is equal to the name of the class variable....
    
    // the class variable can no longer be accessible with the short hand notation in that scope
    
    public static double p = 3.1415; //class variable
    public static void x(){          // class method
         String p = "pi";            // local variable
        System.out.println("1: "+ p);       //.....................location 1 - pi
        System.out.println("2: "+ ShadowClassVar.p); //.. .........location 2 - 3.1415 
    }
    
    public static void main(String[] args) {
        x(); 
        System.out.println("3: "+ p); //....................location 3 - 3.1415
                       
        boolean p = false;
        System.out.println("4: "+ p); //....................location 4 - false
        
        System.out.println("5: "+ShadowClassVar.p); //......location 5 - 3.1415    
    }
}
