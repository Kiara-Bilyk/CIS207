/*    Java Programming 10th Edition
      Chapter 2
      Exercises 02-07

       Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs or 45 cents for individual eggs that are not 
       part of a dozen. Write a program that prompts a user for the number of eggs in the order and then display the amount owed with a full explanation.

      Author: Kiara Bilyk
      Date:   02-07-2025

      Filename: Eggs.java
*/

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final double DOZEN_EGGS = 3.25;
        final double SINGLE_EGG = 0.45;
        System.out.println("Enter number of eggs in order: ");
        Scanner scan = new Scanner(System.in);
        int orderedEggs = scan.nextInt();
        System.out.println("You ordered " + orderedEggs + " eggs. That's " + (orderedEggs/12) + " dozen at $3.25 per dozen and " + (orderedEggs%12) + " loose eggs at 45 cents each for a total of $" + (((orderedEggs/12)*DOZEN_EGGS)+((orderedEggs%12)*SINGLE_EGG)) + ".");
        scan.close();
    }
}
