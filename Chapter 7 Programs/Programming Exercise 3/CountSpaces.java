/*    Java Programming 10th Edition
      Chapter 7
      Exercises 07-03a

       Create a program that contains a String that holds your favorite inspirational quote and display the total number of spaces contained in the String

      Author: Kiara Bilyk
      Date:   04-16-2025

      Filename: CountSpaces.java
*/

public class CountSpaces {
    public static void main(String[] args) {
      StringBuilder quote = new StringBuilder("When darkness rolls on you, Push on through"); // Quote String
      System.out.println(quote); // Ouput Quote

      char x; // char to Check
      int spaces = 0; // Number of Spaces

      // for Loop to Count Spaces
      for (int count = 0; count != quote.length(); count++) {
        x = quote.charAt(count); // Set char to Check
        // Checks if Space
        if (x == ' ') {
          spaces++; // Counts Space
        }
      }

      System.out.println("The number of spaces in the quote is " + spaces + "."); // Output Number of Spaces
  }
}
