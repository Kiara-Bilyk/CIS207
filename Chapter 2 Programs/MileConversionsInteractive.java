/*    Java Programming 10th Edition
      Chapter 1
      Exercises 02-05b

       Convert the MileConversions program to an interactive application. Instead of assigning a value to the miles variable, 
       accept the value from the user as input.

      Author: Kiara Bilyk
      Date:   02-07-2025

      Filename: MileConversionsInteractive.java
*/

import java.util.Scanner;

public class MileConversionsInteractive {
    public static void main(String[] args) {
        final int INCHES_PER_MILE = 63360;
        final int FEET_PER_MILE = 5280;
        final int YARDS_PER_MILE = 1760;
        System.out.println("Enter miles to convert: ");
        Scanner scan = new Scanner(System.in);
        int miles = scan.nextInt();
        System.out.println("In " + miles + " miles there are: " + (miles*INCHES_PER_MILE) + " inches, " + (miles*FEET_PER_MILE) + " feet, and " + (miles*YARDS_PER_MILE) + " yards.");
        scan.close();
    }
}