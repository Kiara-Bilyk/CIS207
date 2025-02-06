/*    Java Programming 10th Edition
      Chapter 1
      GameZone 01-01

      Java application that displays two dialog boxes in sequence. 
      The first asks you to think of a number between 1 and 10. 
      The second displays a randomly generated number
      Author: Kiara Bilyk
      Date:   02-05-2025

      Filename: RandomGuess.java
*/
import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main (String [] args) {
        JOptionPane.showMessageDialog(null, "Guess a number between 1 and 10 then press OK.");
        JOptionPane.showMessageDialog(null, "The number is "+ (1 + (int)(Math.random() * 10)));
    }
}
