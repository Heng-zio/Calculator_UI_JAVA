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

    JFrame frame = new JFrame("Calculator");
    JLabel displayJLabel = new JLabel();
    JPanel displayJPanel = new JPanel();

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
        frame.add(displayJLabel);
    }

}
