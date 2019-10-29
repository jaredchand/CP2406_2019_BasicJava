package week12;

import javax.swing.*;
import java.awt.*;

public class JNestedBoxesPanel extends JPanel {

    int index = 0;
    int GAP = 25;

    JNestedBoxesPanel(){
        setBackground(Color.WHITE);
        for (int i=0; i<8; ++i){

            repaint();
            ++index;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JNestedBoxesPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(10, 10, 380-index*GAP, 380-index*GAP);
        repaint();
    }
}