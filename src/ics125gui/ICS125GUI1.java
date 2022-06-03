package ics125gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
public class ICS125GUI1 {

    JPanel p;
    JFrame f;
    JButton b;
    JLabel label;

    JTextField firstNumber;

    public ICS125GUI1() {

        f = new JFrame("Basic Test!");
        p = new JPanel();

        b = new JButton("Click me", new ImageIcon("images/r.png"));
        b.setRolloverEnabled(true);
        b.setRolloverIcon(new ImageIcon("images/g.png"));

        b.addActionListener(new ButtonListener());
        label = new JLabel("Hello World!");
        firstNumber = new JTextField(10);
        p.add(b);
        p.add(label);
        p.add(firstNumber);
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
        ICS125GUI1 gui = new ICS125GUI1();

    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Value is " + (Integer.parseInt(firstNumber.getText()) + 1));
        }

    }

}
