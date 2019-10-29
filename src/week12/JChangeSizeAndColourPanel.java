package week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JChangeSizeAndColourPanel extends JPanel implements ActionListener {
    int x = 25;
    int y = 100;
    int size = 20;
    private JButton button = new JButton("Alter text");
    String text = "This is a sentence";
    int timesClicked = 0;

    private JChangeSizeAndColourPanel(){
        setBackground(Color.WHITE);
        add(button);
        button.addActionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, size));
        g.drawString(text, x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JChangeSizeAndColourPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++timesClicked;
        if (timesClicked > 2){
            button.setEnabled(false);
        }
        size -= 2;
        x += 15;

        repaint();
    }
}