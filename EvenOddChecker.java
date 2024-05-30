import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenOddChecker extends JFrame {
    private JTextField textField;
    private JLabel resultLabel;

    public EvenOddChecker() {
        setTitle("Even Odd Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel inputLabel = new JLabel("Enter a number:");
        textField = new JTextField(10);

        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(new CheckButtonListener());

        resultLabel = new JLabel("");

        // Add components to the panel
        panel.add(inputLabel, BorderLayout.NORTH);
        panel.add(textField, BorderLayout.CENTER);
        panel.add(checkButton, BorderLayout.EAST);
        panel.add(resultLabel, BorderLayout.SOUTH);

        // Add panel to the frame
        add(panel);

        setVisible(true);
    }

    private class CheckButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputText = textField.getText();
            try {
                int number = Integer.parseInt(inputText);
                if (number % 2 == 0) {
                    resultLabel.setText("Even");
                } else {
                    resultLabel.setText("Odd");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter a valid integer.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EvenOddChecker());
    }
}
