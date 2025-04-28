/*    Java Programming 10th Edition
      Chapter 7
      Exercises 07-02

       Write an application that prompts the user for three first names and concatenates them in every possible two-name combination so that new parents can easily 
       compare them to find the most pleasing baby name.

      Author: Kiara Bilyk
      Date:   04-16-2025

      Filename: BabyNameComparison.java
*/
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String firstName, secondName, thirdName;
        Scanner scan = new Scanner(System.in);
        // Input Names
        System.out.print("Enter first baby name to compare: ");
        firstName = scan.next();
        System.out.print("Enter second baby name to compare: ");
        secondName = scan.next();
        System.out.print("Enter third baby name to compare: ");
        thirdName = scan.next();

        // Output Combinations
        System.out.println("Compare Baby Name:");
        System.out.println(firstName + " " + secondName);
        System.out.println(secondName + " " + thirdName);
        System.out.println(thirdName + " " + firstName);
    }
}
