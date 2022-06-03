package ics125gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mao
 */
public class S1GUI {

    private JFrame f;

    public S1GUI() {
        f = new JFrame("Statics1");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 200);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (int b = 1; b < 9; b++) {
            f.add(new JButton("Button " + b));
        }
        f.setVisible(true);
    }

    public static void main(String[] args) {
        S1GUI s1GUI = new S1GUI();
    }

}
