import javax.swing.*;

public class JTableExample {
    public JTableExample() {
        JFrame frame = new JFrame("JTable Example");

        String[][] data = {
            {"Hitler", "BCA"},
            {"Osama", "BBS"},
            {"Genghis", "BBA"},
            {"Saddam", "BBS"}
        };

        String[] columnNames = {"Name", "Department"};

        JTable j = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(j);
        frame.add(scrollPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableExample();
    }
}
