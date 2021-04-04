/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classinheritance;

/**
 *
 * @author ellon
 */
public class ClassInheritance {

    // inheritance...
    // a concept in OOP, whereby objects of a new class are able to take on the properties..
    // of objects from another existing class
    
    // The existing class - superclass  - parent - the class inherited from
    // The new class      - subclass    - child  - the class that inherits
    
    // the keyword extends is used to show this relationship
    
    public static void main(String[] args) {
        
        
       // instansiating the subclasses 
       Peas cookedPeas = new Peas();
       Mushroom portabello = new Mushroom();
       
       
       // instanceof instruction is used to check the inheritance between objects
       boolean test = cookedPeas instanceof Peas;
       boolean test2 = cookedPeas instanceof Vegetable;
               
       System.out.println(test);
       System.out.println(test2);
       
       // subclass accessing super class methods
       cookedPeas.color = "green";
       cookedPeas.fiber = 3;
       System.out.println(portabello.vitamin());
       System.out.println(cookedPeas.vitamin());
       cookedPeas.eat("Yes");
       
    }  
}


// superclass

// The use of the modifier abstract means that this class cannot be instantiated
// Therefore no objects can be created from it directly
abstract class Vegetable {
    // superclass attributes
     abstract String vitamin();  // an abstract method does not have a body
     public String color;
     protected int fiber;      // the keyword protected is an access modifier that limits the
                               // access/ visibility of the attribute to a class and its sub classes
                               // only, within the same package
                               // Provides encapsulation - only the classes that need to see it/ access it can do so
     
     public void eat(String resp) {
         System.out.println(resp);
     }
}

// subclass

// more specific that the superclass
class Peas extends Vegetable {
    // subclasses have their own unique attributes different from those inherited from the superclass
     public int quantity; 
     // The body of the abstract method is defined in the subclass

    @Override
    String vitamin() {
         String vit = "Vitamin C & Vitamin K";
        return vit;
    }

    // the super keyword - keeps the functionality of the method from the superclass
    // any additional functionality from the subclass can still be provided
    @Override
    public void eat(String resp) {
        super.eat(resp); 
    }
    
   
}

// subclass
class Mushroom extends Vegetable {
     public String type;
     String vitamin() {
      return "Vitamin B";   
     }   
}

// NOTE: --Inheritance Types--

  // the above example shows the hierarchical type of inheritance, where one superclass exists
  // and 2 or more subclasses inherit from it.

  // Other inheritance types are:
              // - Single - where only one superclass and subclass exist
              // - Multilevel - where a subclass also acts as a superclass and has a subclass of its own
              // - Multiple - where a subclass extends more than one superclass (Java does not support this type)

// --Other points--

 // - Code reuse is the most important benefit of inheritance
 // - Private members of a superclass are NOT visible to subclasses (use protected instead)
 // - Superclass constructors are NOT inherited by subclaas(es)
 // - We can use the keyword 'super' to refer to parent class methods, attributes and constructors
      //(This becomes important when we want to keep the superclass behaviour but add more functionality to it)

 // - Use the keyword final for a class that you do not want to extend 
