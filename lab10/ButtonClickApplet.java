/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonClickApplet extends Applet implements ActionListener {
    Button clickButton;

    public void init() {
        // Create a button
        clickButton = new Button("Click Me");

        // Add action listener to the button
        clickButton.addActionListener(this);

        // Add the button to the applet
        add(clickButton);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        if (e.getSource() == clickButton) {
            // Display a message in the applet window
            showStatus("Button Clicked!");
        }
    }
}


