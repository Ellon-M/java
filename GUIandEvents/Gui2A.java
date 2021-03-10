/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIandEvents;

/**
 *
 * @author ellon
 */

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * GUI with multiple events
 */

public class Gui2A {
    JFrame frame;
    JPanel panel;
    JLabel confirmation;
    JButton ifYesBtn;
    JButton ifNoBtn;
    JButton backBtn;
    JLabel origin;
    JLabel destination;
    JTextField originInput;
    JTextField destinationInput;
    
    
    public static void main(String[] args) {
        Gui2A gui = new Gui2A();
        
        gui.fly();
    }
    
    public void fly() {
        frame = new JFrame("Book Flight");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        confirmation = new JLabel("Welcome to Ellon Airlines."
                + " Press Yes to proceed. Press No to cancel");
        confirmation.setBounds(60, 100, 500, 30);
        ifYesBtn = new JButton("Yes");
        ifYesBtn.addActionListener(new ifYesBtnListener());
        panel.add(confirmation);
        panel.add(ifYesBtn);
        ifYesBtn.setBounds(100, 210, 100, 60);
        ifNoBtn = new JButton("No");
        ifNoBtn.addActionListener(new ifNoBtnListener());
        panel.add(ifNoBtn);
        ifNoBtn.setBounds(380, 210, 100, 60);
        
        frame.setSize(600, 480);
        frame.setVisible(true); 
    }
    
        class ifYesBtnListener implements ActionListener {
            public void actionPerformed(ActionEvent e){
                launch();
            }
        }
        class ifNoBtnListener implements ActionListener {
            public void actionPerformed(ActionEvent e){
               confirmation.setText("Aight dip");
               confirmation.setBounds(265, 210, 80, 20);
               panel.remove(ifYesBtn);
               ifNoBtn.setVisible(false);
            }
        }
         
    public void launch() {
        panel.remove(confirmation);
        panel.remove(ifNoBtn);
        panel.remove(ifYesBtn);
        panel.setLayout(null);
        origin = new JLabel("Your Origin: ");
        origin.setBounds(10, 50, 100, 25);
        panel.add(origin);
        
        originInput = new JTextField();
        originInput.setBounds(160, 50, 180, 25);
        panel.add(originInput);
        
        destination = new JLabel("Your Destination: ");
        destination.setBounds(10, 100, 150, 25);
        panel.add(destination);
        
        destinationInput = new JTextField();
        destinationInput.setBounds(160, 100, 180, 25);
        panel.add(destinationInput);
        
        JButton btnCtn = new JButton("Continue");
        btnCtn.setBounds(175, 180, 100, 60);
        panel.add(btnCtn); 
        
        frame.setSize(480, 480);
        frame.setVisible(true); 
    }
    
}
