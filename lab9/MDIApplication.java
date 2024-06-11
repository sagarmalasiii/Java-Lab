package lab9;

import javax.swing.*;
import java.awt.event.*;

public class MDIApplication extends JFrame {
    private JDesktopPane desktopPane;

    public MDIApplication() {
        super("MDI Application");
        
        desktopPane = new JDesktopPane();
        createInternalFrame("Internal Frame 1");
        createInternalFrame("Internal Frame 2");
        
        add(desktopPane);
        
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createInternalFrame(String title) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setLocation(50, 50);

        // Add any additional components or content to the internal frame
        
        desktopPane.add(internalFrame);
        internalFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MDIApplication();
            }
        });
    }
}

