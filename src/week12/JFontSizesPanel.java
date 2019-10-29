package week12;

import javax.swing.*;
import java.awt.*;

public class JFontSizesPanel extends JPanel {
    private String phrase = "Different font sizes";
    int x = 30;
    int y = 0;
    final int GAP = 20;
    private JFontSizesPanel(){
        setBackground(Color.WHITE);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JFontSizesPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(340, 340);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int size = 6;
        for (int i=1; size<20; ++i, ++size) {
            g.setFont(new Font("Arial", Font.PLAIN, size));
            g.setColor(Color.BLACK);
            g.drawString(phrase, x, y + i*GAP);
        }
    }
}