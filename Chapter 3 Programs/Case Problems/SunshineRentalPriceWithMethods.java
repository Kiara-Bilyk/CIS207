/*    Java Programming 10th Edition
      Chapter 3
      Case Problem 03-02

       Sunshine Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and umbrellas to tourists. In Chapter 2, you wrote an application that 
       prompts the user for the number of minutes a piece of sports equipment was rented, displays the company motto with a border, and displays the price for the 
       rental. Now modify the program so that the main() method contains only three executable statements that each call a method as follows:
        - The first executable statement calls a method that prompts the user for the rental time in minutes and returns the value to the main() method.
        - The second executable statement calls a method that displays the company motto with the border.
        - The last executable statement passes the number of minutes to a method that computes the hours, extra minutes, and price for the rental and then displays 
          all the details.

      Author: Kiara Bilyk
      Date:   03-02-2025

      Filename: SunshineRentalPriceWithMethods.java
*/

import java.util.Scanner;

public class SunshineRentalPriceWithMethods {
  public static void main(String[] args) {
    int minutes = inputMinutes();
    outputMotto();
    calulatePrice(minutes);
  }
  // Get input
  public static int inputMinutes() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter minutes of equipment rented: ");
    int time = scan.nextInt();
    scan.close();
    return time;
  }
  // Display motto
  public static void outputMotto() {
    System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    System.out.println("S Sunshine Seashore makes it fun in the sun S");
    System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
  }
  // Calulate hours, minutes, and price then display
  public static void calulatePrice(int time) {
    int hours = (time / 60);
    int minutes = (time % 60);
    int price = ((hours * 40) + minutes);
    System.out.println("Time rented: " + hours + " hours and " + minutes + " minutes");
    System.out.println("Total price: $" + price);
  }
}