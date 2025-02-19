/*    Java Programming 10th Edition
      Chapter 2
      Exercises 02-05a

       Write a program that declares named constants to represent the number of inches, feet, and yards in a mile. 
       Also declare a variable named miles to represent a number of miles and assign a value to it. Compute and display, 
       with explanatory text, the value in inches, feet, and yards.

      Author: Kiara Bilyk
      Date:   02-07-2025

      Filename: MileConversions.java
*/
public class MileConversions {
    public static void main(String[] args) {
        final int INCHES_PER_MILE = 63360;
        final int FEET_PER_MILE = 5280;
        final int YARDS_PER_MILE = 1760;
        int miles = 38;
        System.out.println("In " + miles + " miles there are: " + (miles*INCHES_PER_MILE) + " inches, " + (miles*FEET_PER_MILE) + " feet, and " + (miles*YARDS_PER_MILE) + " yards.");
    }
}
