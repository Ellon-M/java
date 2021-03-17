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
import java.awt.*;
import java.awt.event.*; 


/**
 *
 *  JCheckbox and JScoller 
 */


public class Gui3A {
    JFrame frame;
    JPanel panel;
    JLabel question;
    JLabel proceed;
    JLabel proceedWith;
    JCheckBox forEA;
    JCheckBox forUbi;
    JButton button;
    JList listEA;
    JList listUbi;
    JScrollPane scroller;
    String[] entriesEA;
    String[] entriesUbi;
    
    
    
    public static void main(String[] args) {
        Gui3A gui = new Gui3A();
        
        gui.fly();
}
    
    public void fly(){
     frame = new JFrame("Electronic Arts : Ubisoft");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     panel = new JPanel();
     panel.setLayout(null);
     frame.add(panel);
     question = new JLabel("Choose a list of games from the options below...");
     proceed = new JLabel("Press continue to proceed..");
     question.setBounds(180, 100, 600, 40);
     proceed.setBounds(250, 150, 600, 40);
     panel.add(question);
     panel.add(proceed);
     forEA = new JCheckBox("Electronic Arts");
     forUbi = new JCheckBox("Ubisoft Entertainment");
     panel.add(forEA);
     panel.add(forUbi);
     forEA.addItemListener(new forEAListener());
     forEA.setBackground(Color.LIGHT_GRAY);
     forEA.setCursor(new Cursor(Cursor.HAND_CURSOR));
     forUbi.addItemListener(new forUbiListener());
     forUbi.setBackground(Color.LIGHT_GRAY);
     forUbi.setCursor(new Cursor(Cursor.HAND_CURSOR));
     forEA.setBounds(100,320,180,30);
     forUbi.setBounds(400, 320, 200, 30);
     button = new JButton("Continue");
     button.addActionListener( new btnListener());
     button.setCursor(new Cursor(Cursor.HAND_CURSOR));
     button.setBackground(Color.LIGHT_GRAY);
     panel.add(button);
     button.setBounds(290, 450, 100, 30);
     proceedWith = new JLabel("Continue with EA..");
     proceedWith.setBounds(265, 200, 600, 40);
     panel.add(proceedWith);
     proceedWith.setVisible(false);
     
     
     frame.setSize(720, 720);
     frame.setVisible(true);
}
    
    class forEAListener implements ItemListener {
        public void itemStateChanged(ItemEvent ev){
            if (ev.getStateChange() == ItemEvent.SELECTED){
               proceedWith.setVisible(true);
               forUbi.setEnabled(false);
            }
            else if(!forEA.isSelected()){
                proceedWith.setVisible(false);
                 forUbi.setEnabled(true);
            }
        }
    }
    class forUbiListener implements ItemListener {
        public void itemStateChanged(ItemEvent ev){
            if (forUbi.isSelected()){
                proceedWith.setText("Continue with Ubisoft..");
                proceedWith.setVisible(true);
                forEA.setEnabled(false);
            }
            else if (!forUbi.isSelected()){
                proceedWith.setVisible(false);
                proceedWith.setText("Continue with EA.."); 
                forEA.setEnabled(true);
            }
            
        }
    }
    class btnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(forEA.isSelected() && !forUbi.isSelected()){
                launchEA();
            }
            else if (forUbi.isSelected()){
                launchUbi();
            }
            else {
                proceedWith.setVisible(true);
                proceedWith.setText("Please choose an option to proceed");
            }
        }
    }
    
    public void launchEA(){
        panel.remove(forEA);
        panel.remove(forUbi);
        panel.remove(question);
        panel.remove(proceed);
        panel.remove(proceedWith);
        panel.remove(button);
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new FlowLayout());
        entriesEA = new String[]{"FIFA Mobile", "Plants vs. Zombies Heroes", "Battlefield 1", "Titanfall 2","The Sims 4: Jungle Adventure", "The Sims Mobile","Burnout Paradise Remastered","A Way Out","FIFA Online 4", "Unravel Two", "The Sims 4: Seasons", "Madden NFL 19", "Madden NFL Overdrive","NBA Live 19","EA Sports UFC 4","Madden NFL 21","The Sims 4: Star Wars: Journey to Batuu","Star Wars: Squadrons","FIFA 21","Need for Speed: Hot Pursuit Remastered","The Sims 4: Snowy Escape", "It Takes Two","Mass Effect: Legendary Edition","Knockout City"};
        listEA = new JList(entriesEA);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        scroller = new JScrollPane(listEA);
        scroller.setLocation(300, 300);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);
        listEA.setBounds(100, 190, 200, 100);
        listEA.setVisibleRowCount(10);
        
        frame.setSize(750, 720);
        frame.setVisible(true); 
    }
    
       public void launchUbi(){
        panel.remove(forEA);
        panel.remove(forUbi);
        panel.remove(question);
        panel.remove(proceed);
        panel.remove(proceedWith);
        panel.setBackground(Color.DARK_GRAY);
        panel.remove(button);
        panel.setLayout(new FlowLayout());
        proceed.setText("Ubisoft Games");
        entriesUbi = new String[]{"Tom Clancy's Ghost Recon Breakpoint","Assassin's Creed III Remastered","The Mighty Quest for Epic Loot","Discovery Tour: Assassin's Creed - Ancient Greece","Rayman Mini","Tom Clancy's Ghost Recon Breakpoint","Rabbids: Coding!","Just Dance 2020","Assassin's Creed Odyssey","Might & Magic Heroes: Era of Chaos","Assassin's Creed: The Rebel Collection","Star Trek: Bridge Crew","Tom Clancy's Ghost Recon Breakpoint","Watch Dogs: Legion","Assassin's Creed Valhalla","Hyper Scape","Immortals Fenyx Rising","Scott Pilgrim vs. The World: The Game","Far Cry VR: Dive Into Insanity","Riders Republic","Roller Champions","Skull & Bones","Far Cry 6"};
        listUbi = new JList(entriesUbi);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        scroller = new JScrollPane(listUbi);
        scroller.setLocation(300, 300);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);
        listUbi.setBounds(500, 70, 200, 100);
        listUbi.setVisibleRowCount(10);
        
        frame.setSize(750,720);
        frame.setVisible(true); 
    }
}

