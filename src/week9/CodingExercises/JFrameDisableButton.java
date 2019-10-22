package week9.CodingExercises;

import javax.swing.*;

public class JFrameDisableButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Disable Button");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Click me!");
        button.setBounds(150, 100, 100, 50);

        button.addActionListener(e -> {
            button.setEnabled(false);
        });
        frame.add(button);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
