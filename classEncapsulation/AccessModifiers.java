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
public class AccessModifiers {
    // Encapsulation....
    // the wrapping up of data and functions into one single unit
    // where the data is not accessible to the outside world, and 
    // only the functions which are wrapped (encapsulated) in the class can access it.
    
    // process of hiding object implementation, from another object, presenting only the interfaces that should be visible
    
    
    // Encapsulation is achieved in classes by:
             //- visibility modifiers         - members must be declared with the minimum level of visibility
             //- accessor and mutator methods - getters and setters 
    
 
    
    public static void main(String[] args) {
        
        // instantiate the class
        Wave soundWave = new Wave();
        
        // for the public member of the class
        soundWave.frequency = 13000;
        
        System.out.println("Frequency:" + soundWave.frequency);
        
        // for the private member of the class
        // (we use getters and setters to access the variable, since its access is restricted to other classes)

        soundWave.setWaveForm("Saw Tooth");
        
        // after setting a new wave form
        // the get method is used to call it
        System.out.println("Wave Form: " + soundWave.getWaveForm());
               
    }
    
}

class Wave {
    
    // visibility modifiers (access modifiers)
    
    public int frequency;       // - public (default) 
    private String waveForm;    // - private
    protected int duration;     // - protected
    
    
    
    // public -  the code is accessible to all other classes
    // private -      "   "     "       within its declared class
    // protected - the code is accessible within the declared class and its subclasses but in the same package
    
    // to extend the visibility of the private member to other classes
    // getter method..
    public String getWaveForm(){
        return waveForm;
    }
    
    // and
    public void setWaveForm(String newWaveForm){    // setter method
        this.waveForm = newWaveForm;
    }
} 

