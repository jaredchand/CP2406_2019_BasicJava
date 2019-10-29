package week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JUpsideDownPanel extends JPanel implements ActionListener {
    private boolean rightWayUp = true;

    private JUpsideDownPanel(){
        setBackground(Color.WHITE);
        JButton button = new JButton("Flip text");
        add(button);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JUpsideDownPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        rightWayUp = !rightWayUp;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        String text = "Flip me upside down with the button!";
        if (rightWayUp){
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            g.drawString(text, 0,100);
        } else {
            g.setFont(new Font("Arial", Font.PLAIN, -20));
            g.drawString(text, 350,100);
        }
    }
}