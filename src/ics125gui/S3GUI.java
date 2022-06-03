/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics125gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mao
 */
class S3GUI extends JFrame {

    static final int DIM = 25;
    static final int SIZE = 12;
    static final int GAP = 1;

    public S3GUI() {
        setTitle("Statics3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(DIM, DIM, GAP, GAP));
        for (int i = 0; i < DIM * DIM; i++) {
            add(new MyPanel());
        }
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) { 
        S3GUI s3GUI = new S3GUI(); 
    }

    class MyPanel extends JPanel {

        MyPanel() {
            setPreferredSize(new Dimension(SIZE, SIZE));
        }
        @Override
        public void paintComponent(Graphics g) {
            float gradient
                    = 1f - ((float) Math.abs(getX() - getY())) / (float) ((SIZE + GAP) * DIM);
            g.setColor(new Color(0f, 0f, gradient));
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }
}
