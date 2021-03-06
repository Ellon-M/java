/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.and.events;

/**
 *
 * @author ellon
 */

import javax.swing.*;    // imports the JFrame and other components such as widgets, buttons, textareas etc
import java.awt.*;
import java.awt.event.*; // imports packages that help in declaring and listening to events

/**
 *
 *  A simple GUI with only one event.
 */


     // implement the Action Listener interface from the imported package
     // button action events are only given to classes that implement this interface
public class Gui1A implements ActionListener{
     //button
     JButton button;
     
     public static void main(String[] args) {
         
         // create an instance of the class
         Gui1A gui = new Gui1A();
         
         gui.fly();
         
     }
         
    public void fly(){
        //make a jFrame and a button
        
        // A JFrame is an object that represents a window on a screen where all the interface things go
         JFrame frame = new JFrame();
        // A JPanel is the window pane - where the content goes, since we can't add things to the frame itself
         JPanel panel = new JPanel();
         frame.add(panel);
        // instanciate the button decalred above
         button = new JButton("Click me Pretty Please");
         
        // buttons have an addActionListener() method that allow them a list of listeners 
        // this method only runs if a potential listener (an object from a class with the ActionListener interface implemented) invokes it
        // the button takes a parameter that is a reference to the listener object,
        // which in this case is our method...
         button.addActionListener(this); //we pass our method as the button's reference object
         
        // add the button to the window
         button.setBounds(150,100,100,60);
         panel.add(button);
        
        // add a functionality to the frame to close it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //display the frame
        frame.setSize(480, 720);
        frame.setVisible(true);  
     }
        
      // give an action to be performed by the button    
     public void actionPerformed(ActionEvent e){  
        button.setText("Hey you :)");
        button.setBackground(Color.pink);
}
}
