/*    Java Programming 10th Edition
      Chapter 2
      Exercises 02-06b

       Write an interactive version of the InchesToFeet class that accepts the inches value from a user.

      Author: Kiara Bilyk
      Date:   02-07-2025

      Filename: InchesToFeetInteractive.java
*/

import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        final int INCH_IN_FEET = 12;
        System.err.println("Enter inches to convert: ");
        Scanner scan = new Scanner(System.in);
        int inches = scan.nextInt();
        System.out.println(inches + " inches equals " + (inches/INCH_IN_FEET) + " feet and " + (inches%INCH_IN_FEET) + " inches.");
        scan.close();
    }
}
