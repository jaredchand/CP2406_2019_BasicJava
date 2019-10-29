package week12;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Random;

public class JChangeSizeAndColourPanel2 extends JPanel implements ActionListener {
    int x = 25;
    int y = 100;
    int size = 20;
    float r, g, b;
    Color colour;
    private JButton button = new JButton("Alter text");
    String text = "This is a sentence";

    private JChangeSizeAndColourPanel2(){
        setBackground(Color.WHITE);
        add(button);
        button.addActionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(colour);
        g.setFont(new Font("Arial", Font.PLAIN, size));
        g.drawString(text, x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JChangeSizeAndColourPanel2());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = (int) (Math.random() * 200); // generates a random number to determine where the text should appear
        y = (int) (Math.random() * (250-50) + 50);
        size = (int) (Math.random() * (25-10) + 10);
        r = new Random().nextFloat();
        g = new Random().nextFloat();
        b = new Random().nextFloat();
        colour = new Color(r,g,b);
        repaint();
    }
}