package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        JPanel panel = new JPanel();
        
        JButton buttonRed = new JButton("Red");
        JButton buttonGreen = new JButton("Green");
        JButton buttonBlue = new JButton("Blue");

        buttonRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });

        buttonGreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });

        buttonBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });

        panel.add(buttonRed);
        panel.add(buttonGreen);
        panel.add(buttonBlue);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

