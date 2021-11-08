package tax;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaxCalculator {
    public static void main(String[] args) {

        // Creates JFrame with Tax Calculator title
        JFrame frame = new JFrame("Tax Calculator");
        // Specifies what happens when the close button is clicked.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Sets Layout as null, because we want to use GridLayout later (in line 20)
        frame.setLayout(null);

        // Creates a panel to display components in middle of window
        JPanel panel = new JPanel();
        /* 3 rows: 1 -> jLabelShowMessage, 2 -> jLabelShowResultMessage, 3 -> jButtonCalculate,
         2 columns: 1 -> labels, 2 -> get input and show result */
        panel.setLayout(new GridLayout(3, 2));
        // Specifies the location of the panel in the frame (across the window)
        panel.setBounds(80, 170, 700, 100);

        // Creates a text field 15 characters wide
        final JTextField jTextFieldInput = new JTextField(15);

        // Creates a button with the caption "Calculate".
        JButton jButtonCalculate = new JButton("Calculate");

        // Creates labels to display instructions and Assign font size and font type to each
        JLabel jLabelShowMessage = new JLabel("Enter your salary ");
        jLabelShowMessage.setFont(new Font("Arial", Font.BOLD, 18));
        JLabel jLabelShowResultMessage = new JLabel();
        jLabelShowResultMessage.setFont(new Font("Arial", Font.BOLD, 18));
        JLabel jLabelShowResult = new JLabel("Your salary  without Tax equals to ");
        jLabelShowResult.setFont(new Font("Arial", Font.BOLD, 18));

        // Add textField and button to panel
        panel.add(jLabelShowMessage);
        panel.add(jTextFieldInput);
        panel.add(jLabelShowResult);
        panel.add(jLabelShowResultMessage);
        panel.add(jButtonCalculate);

        // Add the panel to the Frame
        frame.add(panel);

        // Add a listener to the button to manage the events and behaviors of each button
        class TaxActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get input from text field and convert (or cast) to Double
                double originalAmount = Double.parseDouble(jTextFieldInput.getText());

                // Declares constant variable for tax rate
                /*
                    We know 20% == 0.2
                    First way:
                        salary * 0.2 = tax
                        salary - tax = new salary 1
                    Second way: (we use this)
                        1 - 0.2 = 0.8
                        salary * 0.8 = new salary 2
                    In the end, we have the same results =>  new salary 1 == new salary 2
                */
                final double TAXRATE_20PERCENT = 1 - 0.2;
                final double TAXRATE_5PERCENT = 1 - 0.05;

                // Defines limits
                double lowerLimit = 438_900;
                double higherLimit = 638_500;

                // Defines salary for calculating tax on input
                double salary = 0.0;

                // Tax Logic
                do {
                    // Subtracts of 13,100 from all salaries
                    originalAmount = originalAmount - 13100;

                    if (originalAmount <= lowerLimit) {
                        int result = JOptionPane.showConfirmDialog(frame,
                                "Your salary is tax free and is equal to " + originalAmount +
                                        "\n  Do you want to exit?", "Message", JOptionPane.YES_NO_OPTION);

                        // Checks answer and manages what to do
                        switch (result) {
                            case JOptionPane.YES_OPTION:
                                System.exit(0);
                            case JOptionPane.NO_OPTION: {
                                salary = originalAmount;
                                // Fills the jLabelShowResultMessage
                                jLabelShowResultMessage.setText(String.valueOf(originalAmount));
                            }
                        }
                    } else if (originalAmount > lowerLimit && originalAmount <= higherLimit) {
                        salary = ((originalAmount - lowerLimit) * TAXRATE_20PERCENT) + lowerLimit;
                        jLabelShowResultMessage.setText(String.valueOf(salary));
                    } else {
                        salary = ((originalAmount - higherLimit) * TAXRATE_5PERCENT) +
                                ((higherLimit - lowerLimit) * TAXRATE_20PERCENT)
                                + lowerLimit;
                        jLabelShowResultMessage.setText(String.valueOf(salary));
                    }
                // lowerLimit - 13_100 = 425_800
                } while (salary == 0);

            }
        }

        jButtonCalculate.addActionListener(new TaxActionListener());

        // Show frame
        frame.setSize(880, 500);
        frame.setVisible(true);
    }


}
