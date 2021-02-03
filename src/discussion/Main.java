package discussion;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("DiscussionGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2,1));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton button = new JButton("I'm button");
        buttonPanel.add(button);

        JPanel multiplierPanel = new JPanel();
        multiplierPanel.setLayout(new FlowLayout(FlowLayout.CENTER));


        JLabel promptLabel = new JLabel("Enter Two Integers to multiply", JLabel.CENTER);
        JTextField integerA = new JTextField(5);
        JTextField integerB = new JTextField(5);

        JLabel resultLabel = new JLabel("Result ", JLabel.CENTER);
        JTextField resultText = new JTextField(15);
        resultText.setEditable(false);

        multiplierPanel.add(promptLabel);
        multiplierPanel.add(integerA);
        multiplierPanel.add(integerB);
        multiplierPanel.add(resultLabel);
        multiplierPanel.add(resultText);

        mainPanel.add(buttonPanel);
        mainPanel.add(multiplierPanel);
        frame.add(mainPanel);
        frame.setVisible(true);

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "This is button1's action listener");
        });
    }
}
