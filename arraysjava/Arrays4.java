/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package arraysjava;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ellon
 */
public class Arrays4 {
    // more on array lists
    public static void main(String[] args) {
        
    ArrayList<String> got = new ArrayList<>();
    got.add("Cersei Lannister");
    got.add("Tyrion Lannister");
    got.add("Arya Stark");
    got.add("Sansa Stark");
    got.add("Sandor Clegane");
    
    System.out.println(got);
        
System.out.println("\n/----------------------------------------------------------/\n");

        //iterate (different output)
        got.forEach((str) -> {
            System.out.println(str);
        });
     
System.out.println("\n/----------------------------------------------------------/\n");

        // create new array 
        ArrayList<String> got2 = new ArrayList<>();
        String[] characters = {"Jon Snow", "Bran Stark", "Daenerys Targaryen"};
 
        //add string values to array using a for loop
       for (int i = 0; i < characters.length; i++) {
           got2.add(characters[i]);
       }
       
        //adding new elements to specific indexes
        got2.add(1, "Jaime Lannister");
        
        got2.forEach((str) -> {
        System.out.println(str);
    });
        
System.out.println("\n/----------------------------------------------------------/\n"); 
       
       //test out the function
        System.out.println(findLongest(got));
        System.out.println(findLongest(got2));
  
     
    }
    
    // create a function that returns the longest string in the arraylist
    public static String findLongest(ArrayList<String> list) {
        String longest = "";
        
        for(String element: list) {
            if (element.length() > longest.length()) {
               longest = element;
            }
          
        }
         return longest;
    }
}


