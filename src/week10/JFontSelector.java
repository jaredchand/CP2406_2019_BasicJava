package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.BatchUpdateException;
import java.util.concurrent.Flow;

public class JFontSelector extends JFrame implements ActionListener {
    JPanel panel1 = new JPanel(new FlowLayout());
    JPanel panel2 = new JPanel();

    Button font1 = new Button("Font 1");
    Button font2 = new Button("Font 2");
    Button font3 = new Button("Font 3");
    Button font4 = new Button("Font 4");
    Button font5 = new Button("Font 5");
    Button changeSize = new Button("Larger/ smaller");
    JLabel fontString = new JLabel("Change my font with the buttons above.");

    public static void main(String[] args) {
        JFontSelector jFontSelector = new JFontSelector();
    }

    public JFontSelector(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));


        font1.addActionListener(this);
        font2.addActionListener(this);
        font3.addActionListener(this);
        font4.addActionListener(this);
        font5.addActionListener(this);
        changeSize.addActionListener(this);
        add(font1);
        add(font2);
        add(font3);
        add(font4);
        add(font5);
        add(changeSize);
        add(fontString);

        pack();
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    boolean largeSmall = true;
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == font1){
            fontString.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        } else if (source == font2){
            fontString.setFont(new Font("Calibri", Font.PLAIN, 20));
        } else if (source == font3){
            fontString.setFont(new Font("Arial", Font.PLAIN, 20));
        } else if (source == font4){
            fontString.setFont(new Font("Batang", Font.PLAIN,20));
        } else if (source == font5){
            fontString.setFont(new Font("Impact", Font.PLAIN, 20));
        } else if (source == changeSize){
            if (largeSmall) {
                fontString.setFont(new Font(fontString.getName(), Font.PLAIN, 25));
            } else {
                fontString.setFont(new Font(fontString.getName(), Font.PLAIN, 15));
            }
            largeSmall = !largeSmall;
        }
    }
}