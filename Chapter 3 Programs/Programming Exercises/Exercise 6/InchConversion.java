/*    Java Programming 10th Edition
      Chapter 3
      Exercises 03-06

       There are 12 inches in a foot and 3 feet in a yard. Create a class named InchConversion. Its main() method accepts a value in 
       inches from a user at the keyboard and then passes the entered value to two methods. One converts the value from inches to feet, 
       and the other converts the same value from inches to yards. Each method displays the results with appropriate explanation. 

      Author: Kiara Bilyk
      Date:   02-25-2025

      Filename: InchConversion.java
*/
import java.util.Scanner;

public class InchConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Get input
        System.out.println("Enter inches to covert: ");
        double inches = scan.nextInt();
        inchToFeet(inches);
        inchToYard(inches);

        scan.close();
    }
    public static void inchToFeet(double inch) {
        double feet = (inch / 12);
        System.out.println((int)inch + " inches is equal to " + feet + " feet.");
    }
    public static void inchToYard(double inch) {
        double yard = (inch / 36);
        System.out.println((int)inch + " inches is equal to " + yard + " yards.");
    }
}