package week10;// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
public class DebugFifteen2 extends JFrame
{
   JButton nb = new JButton("Left    ");
   JButton sb = new JButton("Down  ");
   JButton eb = new JButton("Right ");
   JButton wb = new JButton("Center  ");
   JButton cb = new JButton("Up");
   Container con = null;

   public DebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout());
      con.add(nb, BorderLayout.WEST);
      con.add(sb, BorderLayout.SOUTH);
      con.add(eb, BorderLayout.EAST);
      con.add(wb, BorderLayout.CENTER);
      con.add(cb, BorderLayout.NORTH);
   }
   public static void main(String[] args)
   {
      DebugFifteen2 f = new DebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}