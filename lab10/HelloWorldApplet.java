

package javaapplication1;


import java.applet.Applet;
import java.awt.*;

public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        // Get the dimensions of the applet window
        int width = getSize().width;
        int height = getSize().height;

        // Set the color and font for the message
        g.setColor(Color.black);
        g.setFont(new Font("Times New Roman", Font.BOLD, 20));

        // Calculate the position to center the message
        FontMetrics fm = g.getFontMetrics();
        int messageWidth = fm.stringWidth("Hello, Applet!");
        int messageHeight = fm.getHeight();
        int x = (width - messageWidth) / 2;
        int y = (height + messageHeight) / 2;

        // Draw the message in the center of the applet window
        g.drawString("Hello, Applet!", x, y);
    }
}

