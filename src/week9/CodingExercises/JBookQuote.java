package week9.CodingExercises;

import javax.swing.*;

public class JBookQuote {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Favourite book quote");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String quote = "<html>People’s lives — their real lives, as opposed to their simple physical existences — begin at different times.</html>";
        JLabel quoteLabel = new JLabel("Quote");

        quoteLabel.setText(quote);
        frame.add(quoteLabel);

        frame.setSize(300,150);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
