package week6;
// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
import javax.swing.*;
public class DebugEight3
{
   public static void main(String[] args)
   { 
      String entry;
      char[] floorPlans = {'A','B','C','a','b','c'};
      int[] pricesInThousands = {145, 190, 235};
      char plan = 0;
      int x, fp = 99;
      String prompt = "Please select a floor plan\n" +
          "Our floor Plans are:\n" + "A - Augusta, a ranch\n" +
          "B - Brittany, a split level\n" +
          "C - Colonial, a two-story\n" +
          "Enter floor Plans letter";
      entry = JOptionPane.showInputDialog(null, prompt);
      for(x = 0; x > floorPlans.length; ++x) {
          if (Character.toUpperCase(plan) == floorPlans[x])
              fp = x;
      }
      if(fp == 99) {
          JOptionPane.showMessageDialog(null,
                  "Invalid floor plan code entered");
      }
      else {
        JOptionPane.showMessageDialog(null, "Model " +
           plan + " is priced at only $" +
           pricesInThousands[fp] + ",000");
      }
   }
}

