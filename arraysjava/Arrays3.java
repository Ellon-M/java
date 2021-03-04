/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysjava;

import java.util.ArrayList;

/**
 *
 * @author ellon
 */
public class Arrays3 {
    //ArrayLists
    
    public static void main(String[] args) {
        
    //using type string    
    ArrayList<String> myList  = new ArrayList<String>();
    
      //using type integer (int is a primitive data type: cannot be used in arraylists)
    ArrayList<Integer> myList2  = new ArrayList<Integer>();
    
    
    //methods we can use on ArrayLists
    
    // adding values
    myList.add("Jump");
    myList.add("Shoot");
    myList2.add(10);
    
    //how many items are in the array
    int size = myList.size();
        System.out.println(size);
    
    //find an index
    int idx = myList2.indexOf(10);
        System.out.println(idx);
        
    //remove items
    myList.remove("Shoot");
        int newSize = myList.size();
        System.out.println(newSize);
        
    //get items
    int num = myList2.get(0);
    System.out.println(num);
    
    // using objects from a class
    ArrayList<Ball> myBalls = new ArrayList<Ball>();
    
    Ball football = new Ball();
    Ball basketball = new Ball();
    Ball beachball = new Ball();
    
    myBalls.add(beachball);
    myBalls.add(football);
    int ballSize = myBalls.size();
    
    // check if an object is in an array
    boolean isIn = myBalls.contains(beachball);
    
    System.out.println(ballSize);
     System.out.println(isIn);
    }
    
}

class Ball {
        
    }









