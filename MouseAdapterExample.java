import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample {
    Frame f;

    MouseAdapterExample() {
        f = new Frame("Mouse Adapter");
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Graphics g = f.getGraphics();
                g.setColor(Color.RED);
                g.fillOval(e.getX(), e.getY(), 30, 30);
            }
        });
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
