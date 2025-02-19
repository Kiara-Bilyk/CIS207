/*    Java Programming 10th Edition
      Chapter 2
      Exercises 02-06a

       Write a program that declares a variable named inches, which holds a length in inches, and assign a value. 
       Display the value in feet and inches.

      Author: Kiara Bilyk
      Date:   02-07-2025

      Filename: InchesToFeet.java
*/
public class InchesToFeet {
    public static void main(String[] args) {
        final int INCH_IN_FEET = 12;
        int inches = 86;
        System.out.println(inches + " inches equals " + (inches/INCH_IN_FEET) + " feet and " + (inches%INCH_IN_FEET) + " inches.");
    }
}
