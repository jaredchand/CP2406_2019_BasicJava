package week10;

import javax.swing.*;
import java.awt.*;

public class JMovieFrame {
    public static void main(String[] args) {
        JMovieFrame jMovieFrame = new JMovieFrame();
    }
    public JMovieFrame(){
        JFrame frame = new JFrame("JMovieFrame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        Button east = new Button("East of Eden");
        frame.add(east, BorderLayout.EAST);
        Button north = new Button("North by Northwest");
        frame. add(north, BorderLayout.NORTH);
        Button west = new Button("A Million Ways to Die in the West");
        frame.add(west, BorderLayout.WEST);
        Button center = new Button("Journey to the Center of the Earth");
        frame.add(center, BorderLayout.CENTER);
        JLabel movieInformation = new JLabel();
        frame.add(movieInformation, BorderLayout.SOUTH);

        east.addActionListener(e -> {
            movieInformation.setText("Movie released in 1955, stars James Dean");
        });
        north.addActionListener(e -> {
            movieInformation.setText("Movie released in 1959, stars Cary Grant");
        });
        west.addActionListener(e -> {
            movieInformation.setText("Movie released in 2014, stars Seth MacFarlane");
        });
        center.addActionListener(e -> {
            movieInformation.setText("Movie released in 2008, stars Brendan Fraser");
        });

        frame.setSize(500,300);
        frame.setVisible(true);
    }
}