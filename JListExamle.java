import javax.swing.*;

public class JListExamle {
    JListExamle() {
        JFrame f = new JFrame("JList Example");

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Cricket");
        listModel.addElement("Football");
        listModel.addElement("Basketball");
        listModel.addElement("Volleyball");

        JList<String> list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);

        f.setLayout(new java.awt.BorderLayout());
        f.add(scrollPane, java.awt.BorderLayout.CENTER);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JListExamle();
    }
}
