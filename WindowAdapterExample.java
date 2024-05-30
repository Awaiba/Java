import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample {
    Frame f;

    WindowAdapterExample() {
        f = new Frame("Window adapter");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new WindowAdapterExample();
    }
}
