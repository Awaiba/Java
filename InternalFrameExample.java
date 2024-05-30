import javax.swing.*;

public class InternalFrameExample {
    public static void main(String[] args) {
        // Create the parent frame
        JFrame parentFrame = new JFrame("Parent Frame");
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parentFrame.setSize(600, 400);

        // Create the desktop pane
        JDesktopPane desktopPane = new JDesktopPane();
        
        // Create the first internal frame
        JInternalFrame internalFrame1 = new JInternalFrame("Internal Frame1", true, true, true, true);
        internalFrame1.setBounds(50, 50, 200, 150);
        internalFrame1.setVisible(true);
        
        // Create the second internal frame
        JInternalFrame internalFrame2 = new JInternalFrame("Internal Frame2", true, true, true, true);
        internalFrame2.setBounds(250, 100, 200, 150);
        internalFrame2.setVisible(true);

        // Add internal frames to the desktop pane
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        // Add the desktop pane to the parent frame
        parentFrame.add(desktopPane);

        // Make the parent frame visible
        parentFrame.setVisible(true);
    }
}
