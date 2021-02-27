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
public class Arrays2 {
    public static void main(String[] args) {
        // more on arrays
        
        // declaration
        int[] index;
        
        // create
        index = new int[5];
        
        // pass values
        index[0] = 1;
        index[1] = 4;
        index[2] = 3;
        index[3] = 0;
        index[4] = 2;
        
        // declare and create another array
        int[] indexIndex = new int[5];
        
        //pass values to new array
        indexIndex[0] = 3; // 1
        indexIndex[1] = 2; // 4
        indexIndex[2] = 4; // 3
        indexIndex[3] = 0; // 0
        indexIndex[4] = 1; // 2
        int x = 0;
        int ref;
        int refRef;
            
        //declare and create another array
        String[] classmates = new String[5];
        
        //pass values to new array
        classmates[0] = "Shane"; 
        classmates[1] = "Rashid";
        classmates[2] = "Prince";
        classmates[3] = "Kunty";
        classmates[4] = "Asher";
            
        while (x < 5) {
            ref = index[x];
            int y = indexIndex[ref];
            x+=1;
            refRef = indexIndex[y];
            System.out.print("Classmates: ");
            System.out.println(classmates[refRef]);
            
            //The print("...") method instead prints just the string "...", 
            //but does not move the cursor to a new line.
            //The println("...") method prints the string "...",
            //and moves the cursor to a new line.        
        }
    }
}

