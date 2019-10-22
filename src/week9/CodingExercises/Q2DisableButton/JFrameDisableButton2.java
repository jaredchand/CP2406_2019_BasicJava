package week9.CodingExercises.Q2DisableButton;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class JFrameDisableButton2 {
    public static void main(String[] args) {
        AtomicInteger timesClicked = new AtomicInteger();
        JFrame frame = new JFrame("Disable Button");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Click me!");
        button.setBounds(150, 100, 100, 50);
        button.addActionListener(e -> {
            timesClicked.getAndIncrement();
            if (timesClicked.get() >= 8)
                button.setEnabled(false);
        });
        frame.add(button);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
