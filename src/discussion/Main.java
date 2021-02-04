package discussion;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //create main window
        JFrame frame = new JFrame("DiscussionGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 150);
        frame.setLocationRelativeTo(null);

        //create main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1));

        //create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton button = new JButton("I'm button 1");
        buttonPanel.add(button);

        //create input panel
        JPanel multiplierPanel = new JPanel();
        multiplierPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel promptLabel = new JLabel("Enter Two Integers to multiply", JLabel.CENTER);
        JTextField integerA = new JTextField(5);
        JTextField integerB = new JTextField(5);
        JButton calculateButton = new JButton("Multiply!");
        multiplierPanel.add(promptLabel);
        multiplierPanel.add(integerA);
        multiplierPanel.add(integerB);
        multiplierPanel.add(calculateButton);

        //create result panel
        JPanel resultPanel = new JPanel();
        JLabel resultLabel = new JLabel("Result ", JLabel.CENTER);
        JTextField resultText = new JTextField(15);
        resultText.setEditable(false);
        resultPanel.add(resultLabel);
        resultPanel.add(resultText);

        //add button, input, result to main panel
        mainPanel.add(buttonPanel);
        mainPanel.add(multiplierPanel);
        mainPanel.add(resultPanel);

        //add main panel and set frame visible
        frame.add(mainPanel);
        frame.setVisible(true);

        //action listeners for buttons
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "This is button 1's action listener"));
        calculateButton.addActionListener(e -> resultText.setText(multiply(integerA.getText(), integerB.getText())));
    }

    //method to multiply inputs
    private static String multiply(String x, String y) {
        return Integer.toString(Integer.parseInt(x) * Integer.parseInt(y));
    }
}
