package ics125gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mao
 */
class S2GUI extends JFrame {

    class ColoredJPanel extends JPanel {

        Color color;

        ColoredJPanel(Color color) {
            this.color = color;
        }

        public void paintComponent(Graphics g) {
            g.setColor(color);
            g.fillRect(0, 0, 400, 400);
        }
    }

    public S2GUI() {
        setTitle("Statics2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        add(new ColoredJPanel(Color.RED), BorderLayout.NORTH);
        add(new ColoredJPanel(Color.GREEN), BorderLayout.SOUTH);
        add(new ColoredJPanel(Color.BLUE), BorderLayout.WEST);
        add(new ColoredJPanel(Color.YELLOW), BorderLayout.EAST);
        add(new ColoredJPanel(Color.BLACK), BorderLayout.CENTER);
        setVisible(true);
    }
    
    public static void main(String[] args) { 
        S2GUI s2GUI = new S2GUI(); 
    }
}
