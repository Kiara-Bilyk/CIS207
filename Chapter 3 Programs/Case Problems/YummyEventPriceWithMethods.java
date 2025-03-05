/*    Java Programming 10th Edition
      Chapter 3
      Case Problem 03-01

       Yummy Catering provides meals for parties and special events. In Chapter 2, you wrote an application that prompts the user for the number of guests attending 
       an event, displays the company motto with a border, and then displays the price of the event and whether the event is a large one. Now modify the program so 
       that the main() method contains only three executable statements that each call a method as follows:
        - The first executable statement calls a public static int method that prompts the user for the number of guests and returns the value to the main() method.
        - The second executable statement calls a public static void method that displays the company motto with the border.
        - The last executable statement passes the number of guests to a public static void method that computes the price of the event, displays the price, and 
          displays whether the event is a large event.

      Author: Kiara Bilyk
      Date:   03-02-2025

      Filename: YummyEventPriceWithMethods.java
*/

import java.util.Scanner;

public class YummyEventPriceWithMethods {
  public static void main(String[] args) {
    int guestAmount = inputGuests();
    outputMotto();
    calculateGuests(guestAmount);
  }
  // Method to get input for number of guests
  public static int inputGuests() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of guests: ");
    int guestAmount = scan.nextInt();
    scan.close();
    return guestAmount;
  }
  // Method to display motto
  public static void outputMotto() {
    System.out.println("**********************************************");
    System.out.println("* Yummy makes the food that makes it a party *");
    System.out.println("**********************************************");
  }
  // Method to calulate guest totals and display
  public static void calculateGuests(int guests) {
    final int LARGE_EVENT = 50;
    final int PRICE_PER_GUEST = 35;
    System.out.println("Number of Guests: " + guests);
    System.out.println("Price per guest: $" + PRICE_PER_GUEST);
    System.out.println("Total price: $" + (guests * PRICE_PER_GUEST));
    System.out.println("Large event: " + (guests >= LARGE_EVENT));
  }
}
