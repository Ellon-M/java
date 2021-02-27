/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysjava;

/**
 *
 * @author ellon
 */
public class Arrays1 {
   
    public static void main(String[] args) {
       // arrays
       
       // declare an array variable
       int[] nums;
       
       //create a new int array and assign it to the created variable nums
       nums = new int[3];
       
       // give values to each array element
       nums[0] = 5;
       nums[1] = 10;
       nums[2] = 15;
       
       // output the 3 array elements
        for ( int output: nums) {
         System.out.println(output);
        }
        
        
    System.out.println("\n/----------------------------------------------------------/\n");
       
     
     // declare and create an array of humans from existing class Human
       Human[] humans  = new Human[3];
       
     // insert humans into the array - or objects into the class.
     // *Arrays are objects*
       humans[0] = new Human();
       humans[1] = new Human();
       humans[2] = new Human();
       
     // access the humans inside the array using the dot operator to refer to their names 
     //(reference variable)
       humans[0].name = "Gabriel";
       humans[1].name = "Alice";
       humans[2].name = "Hannah";
       
     // Loop through the array using its length
     //(both a for and a while loop would work)
     // *for loop recommended* 
       int x = 0;
        while (x < humans.length) {
            humans[x].speak();
            x+=1;
         }
    }
    
}

 // make a class Human 
  class Human {
     // create variables / methods
     String name;
     public void speak() {
         System.out.println( name + " " +"says, 'I miss you..'");
     }
 }
 

 
       
       
       
       
       
       

    
