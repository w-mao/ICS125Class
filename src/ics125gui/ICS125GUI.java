package ics125gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ics125gui;
/**
 *
 * @author C0525746
 */
public class ICS125GUI {
    JPanel p;
    JFrame f;
    JButton b;
    JLabel label;
    JTextField text;
    JTextField text1;
    
    public ICS125GUI(){
 
        f = new JFrame("Basic Test!");   
        p = new JPanel();
        
        text = new JTextField("0");
        text1 = new JTextField("1");
        
        b = new JButton("New Document", new ImageIcon("images/g.png"));
        b.setRolloverEnabled(true);
        b.setRolloverIcon(new ImageIcon("images/r.png"));
 
        b.addActionListener(new ButtonListener());
        label = new JLabel("Hello World!");
        p.add(b);
        p.add(label);
        p.add(text);
        p.add(text1);
        f.getContentPane().add(p);
  
        //quit Java after closing the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200); //set size in pixels
        f.setVisible(true); //show the window
    
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(args[0]);
        //System.out.println(args[1]);
        ICS125GUI gui = new  ICS125GUI();
    }
    
    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
           String textf = text.getText();
           String text1f = text1.getText();
           int i;
           i = Integer.parseInt(textf) + Integer.parseInt(text1f);
           label.setText("The sum is: " + i); 
        }
        
    } 

}
