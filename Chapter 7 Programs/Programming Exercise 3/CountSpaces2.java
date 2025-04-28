/*    Java Programming 10th Edition
      Chapter 7
      Exercises 07-03b

       Write an application that counts the total number of spaces contained in a quote entered by the user.

      Author: Kiara Bilyk
      Date:   04-16-2025

      Filename: CountSpaces.java
*/
import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a quote to count the spaces in: ");
        StringBuilder quote = new StringBuilder(scan.nextLine()); // Builts String from Input
        System.out.println(quote); // Output Quote

        char x; // char to Check
        int spaces = 0; // Number of Spaces

        // for Loop to Count Spaces
        for (int count = 0; count != quote.length(); count++) {
          x = quote.charAt(count); // Set char to Check
          // Checks if Space
          if (x == ' ') {
            spaces++; // Count Space
        }
      }

      System.out.println("The number of spaces in the quote is " + spaces + "."); // Output Number of Spaces
    }
}
