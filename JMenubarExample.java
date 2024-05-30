import javax.swing.*;
import java.awt.event.*;

public class JMenubarExample extends JFrame {
    static JMenuBar mb;
    static JMenu file, edit, format, view, help, submenu;
    static JMenuItem neww, newWindow, open, save, saveAs, pageSetUp, print, exit;
    static JMenuItem subMenuItem1, subMenuItem2;
    static JFrame f;

    public static void main(String[] args) {
        f = new JFrame("Menu demo");

        mb = new JMenuBar();

        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        view = new JMenu("View");
        help = new JMenu("Help");
        submenu = new JMenu("SubMenu");

        neww = new JMenuItem("New");
        newWindow = new JMenuItem("New Window");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save As");
        pageSetUp = new JMenuItem("Page Setup");
        print = new JMenuItem("Print");
        exit = new JMenuItem("Exit");
        subMenuItem1 = new JMenuItem("SubMenu Item 1");
        subMenuItem2 = new JMenuItem("SubMenu Item 2");

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        file.add(neww);
        file.add(newWindow);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(pageSetUp);
        file.add(print);
        file.add(exit);

        submenu.add(subMenuItem1);
        submenu.add(subMenuItem2);

        file.add(submenu);

        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view);
        mb.add(help);

        f.setJMenuBar(mb);

        f.setSize(500, 500);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
