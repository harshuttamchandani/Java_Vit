import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FibonacciGUI extends JFrame {

    private JTextField inputField;
    private JTextArea outputArea;

    public FibonacciGUI() {
        super("Fibonacci Generator");

        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();

        inputPanel.add(new JLabel("Enter a number:"));
        inputField = new JTextField(10);
        inputPanel.add(inputField);

        JButton generateButton = new JButton("Generate Fibonacci Series");
        generateButton.addActionListener(new ButtonListener());
        inputPanel.add(generateButton);

        outputArea = new JTextArea(10, 20);
        outputArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int n;
            try {
                n = Integer.parseInt(inputField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            StringBuilder output = new StringBuilder();
            output.append("Fibonacci series up to ").append(n).append(":\n");

            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                output.append(a).append(" ");
                int temp = a + b;
                a = b;
                b = temp;
            }

            outputArea.setText(output.toString());
        }
    }

    public static void main(String[] args) {
        new FibonacciGUI();
    }
}
