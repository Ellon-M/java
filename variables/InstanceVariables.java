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
public class InstanceVariables {
    // defined inside a class
    // defined outside every method of that class
    // defined WITHOUT the static keyword
    
    // an object is normslly refered to as instance of a class
    // objects, are groups of instance variables specified in the definition of the class
    
    
     public static void main(String[] args){
        // breaking down class instantiation
        
        Visual boxplot;       
        // creation of a local variable (boxplot) - also called the object reference variable
        //A local variable is a variable declared inside a method. 
        //Local variablea are only accessible inside the method that declares them. 
        
        
        boxplot = new Visual();
        // creation of the visual object, which then
        // makes the var - 'boxplot' - point to the group of variables that were defined in the Visual class
    
        // more objects..
       Visual historgam, scatterplot;
       historgam = new Visual();
       scatterplot = new Visual();
       
       // now the objects can use the group of variables that were defined in the class
       historgam.name = "Bell-Shaped Histogram";
       historgam.count = 34;
       scatterplot.name = "Negative correlation Scatter plot";
       scatterplot.count = 22;
       
         System.out.println("Visual: " + historgam.name + "\n" + "Distribution Count: "+ historgam.count );
         System.out.println("Visual: " + scatterplot.name + "\n" + "Distribution Count: "+ scatterplot.count );
    
    
    }
}  


    //class
 class Visual {
     
     // instance variables - only initialised when an object from this class is created
        public String name;
        public int count;  
    }
