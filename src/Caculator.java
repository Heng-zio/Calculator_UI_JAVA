import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Caculator {
    int boardwidth = 360;
    int boardheight = 540;

    Color customLightGray = new Color(212, 212, 210);
    Color customDarkGray = new Color(80, 80, 80);
    Color customBlack = new Color(28, 28, 28);
    Color customOrange = new Color(255, 149, 0);

    String[] buttonValues = {
        "AC", "+/-", "%", "÷", 
        "7", "8", "9", "×", 
        "4", "5", "6", "-",
        "1", "2", "3", "+",
        "0", ".", "√", "="
    };
    String[] rightSymbols = {"÷", "×", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

    JFrame frame = new JFrame("Calculator");
    JLabel displayJLabel = new JLabel();
    JPanel displayJPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

    Caculator() {
        frame.setVisible(true);
        frame.setSize(boardwidth,boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayJLabel.setBackground(customBlack);
        displayJLabel.setForeground(Color.white);
        displayJLabel.setFont(new Font("Arail",Font.PLAIN, 80));
        displayJLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayJLabel.setText("0");
        displayJLabel.setOpaque(true);

        displayJPanel.setLayout(new BorderLayout());
        displayJPanel.add(displayJLabel);
        frame.add(displayJLabel,BorderLayout.NORTH);
<<<<<<< Updated upstream
=======

        buttonsPanel.setLayout(new GridLayout(5,4));
        buttonsPanel.setBackground(customBlack);
        frame.add(buttonsPanel);

        for (int i = 0; i < buttonValues.length; i++) {
            JButton button = new JButton();
            String buttonValue = buttonValues[i];
            button.setFont(new Font("Arail",Font.PLAIN, 30));
            button.setText(buttonValue);
        }
>>>>>>> Stashed changes
    }

}
