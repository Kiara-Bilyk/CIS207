/*    Java Programming 10th Edition
      Chapter 1
      Exercises 02-04b

       Convert the QuartsToGallons program to an interactive application. Instead of assigning a value to the number of quarts, accept the 
       value from the user as input. Save the revised program as QuartsToGallonsInteractive.java.

      Author: Kiara Bilyk
      Date:   02-07-2025

      Filename: QuartsToGallonsInteractive.java
*/

import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        System.out.println("Enter quarts nedded for job: ");
        Scanner scan = new Scanner(System.in);
        int quartsNeeded = scan.nextInt();
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + (quartsNeeded/QUARTS_IN_GALLON) + " gallons plus " + (quartsNeeded%QUARTS_IN_GALLON) + " quarts.");
        scan.close();
    }
}