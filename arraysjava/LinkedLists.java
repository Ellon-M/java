/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysjava;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 *
 * @author ellon
 */
public class LinkedLists {
    
     public static void main (String args[]) {
    // linked lists and list iterators
    
    // linked lists are similar to arraylists
    // However in linked lists each item in the list is stored in a 'container',
    // that has a link to the next one in the list, and the previous one; and so on.
    // Therefore, unlike array lists that store data for one value at one single position,
    // linked lists store three different types of data in one position.
    
    LinkedList<Integer> grd = new LinkedList<>();
     grd.add(80);
     grd.add(70);
     grd.add(84);
     grd.add(60);
     
     System.out.println("Grades: " + grd);
     
     // set
     grd.set(3, 89);
     
     System.out.println("New Grades: " + grd);
     
     // instead....
     grd.removeLast();
     grd.addLast(89);
     
     System.out.println("Updated grades: " + grd);
         
     // other specific methods - addFirst, removeFirst, getFirst, getLast..
     
     // linked lists can also be used as Queue - with the methods, offer(), peek() and poll()..
     
     // using a list iterator to iterate through the linked list
     ListIterator<Integer> iterate = grd.listIterator();
     
     // list iterator methods
     
     // next()
     
     //iterates over the first element in the list
     iterate.next();
     
     // second element....
     int secondGrd = iterate.next();
     
      System.out.println("Grade 2: "+ secondGrd);
      
     // nextIndex() method does the same as this, but returns the index of the element instead of the element itself
    
     //previous() does the opposite of the next() method
     
     // the hasNext() and hasPrevious() methods ..
     // return true or false values, that help iterate through all the elements in the list 
     
     System.out.println("\n/----------------------------------------------------------/\n");
     
     // iterates over the next elements in the list 
      while (iterate.hasNext()) {
         System.out.println(iterate.next());
    }
      System.out.println("\n/----------------------------------------------------------/\n");
      // reverse
      while (iterate.hasPrevious()) {
         System.out.println(iterate.previous());
       }
     } 
}


