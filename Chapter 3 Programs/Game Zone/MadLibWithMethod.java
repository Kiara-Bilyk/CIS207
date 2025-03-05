/*    Java Programming 10th Edition
      Chapter 3
      Game Zone 03-01

       Create a program that asks the user to provide a few words. Then send the words to a method that displays a short story or 
       nursery rhyme that uses them.

      Author: Kiara Bilyk
      Date:   02-26-2025

      Filename: MadLibWithMethod.java
*/

import java.util.Scanner;

public class MadLibWithMethod {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      // Get input for words
      System.out.print("Enter a type of pet: ");
      String pet1 = scan.next();
      System.out.print("Enter an animal: ");
      String animal1 = scan.next();
      System.out.print("Enter a second type of pet: ");
      String pet2 = scan.next();
      System.out.print("Enter an everyday object: ");
      String object1 = scan.next();
      poemOutput(pet1, animal1, pet2, object1);
      scan.close();

    }
      // Method to output the poem
    public static void poemOutput(String a, String b, String c, String d) {
      System.out.println("Hey diddle diddle,");
      System.out.println("The " + a + " and the fiddle,");
      System.out.println("The " + b + " jumped over the moon.");
      System.out.println("The little " + c + " laughed to see such sport,");
      System.out.println("And the " + d +" ran away with the spoon.");
    }
}