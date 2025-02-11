/*    Java Programming 10th Edition
      Chapter 1
      Exercises 02-04a

       Write a program that declares a named constant to hold the number of quarts in a gallon and a variable to represent 
       the number of quarts needed for a painting job. Compute and display the number of gallons and quarts needed for the job.

      Author: Kiara Bilyk
      Date:   02-07-2025

      Filename: QuartsToGallons.java
*/
public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + (quartsNeeded/QUARTS_IN_GALLON) + " gallons plus " + (quartsNeeded%QUARTS_IN_GALLON) + " quarts.");
    }
}