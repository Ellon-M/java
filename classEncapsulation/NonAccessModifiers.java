/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classEncapsulation;

/**
 *
 * @author ellon
 */
public class NonAccessModifiers {
    // these modifiers are not used to control access to classes,
    // but they provide other functionality..
    // they describe how a class can be manipulated
    
    // they are usually used during class inheritance
    
    public static void main(String[] args) {
        
        // trying to override a variable declared final will bring an error
        // Accountant.age = 19;
    }
    
}
// 1. Final


// the final keyword prevents this class from being inherited by other classes
final class Account {
    int balance = 30000;
    int accNo = 101010;
}

// the final keyword also prevents attributes and methods from being overriden
class Accountant {
    final String name = "Viggy";
    final int age  = 20;
    final int id = 232323;
}

// 2. Abstract

// the abstract keyword is used in classes that cannot/ are not intended to create objects
// to access abstract classes, inheritance comes to play
abstract class Finance{
    // trying to create an object from the abstract class will bring an error
    // Finance interFinance = new Finance();

}

// the abstract keyword is also used in methods, but the method declared does not have a body
// the body is declared in the subclass ( a class that inherits from it )
// the class containing abstract methods must also be abstract
abstract class Yesterday {
 public abstract void study();   
}
