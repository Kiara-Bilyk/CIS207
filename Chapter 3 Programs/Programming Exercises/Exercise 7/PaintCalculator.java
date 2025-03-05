/*    Java Programming 10th Edition
      Chapter 3
      Exercises 03-07

        Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main() method that prompts the user for the length, 
        width, and height of a rectangular room. Pass these three values to a method that does the following:
            Calculates the wall area for a room
            Passes the calculated wall area to another method that calculates and returns the number of gallons of paint needed
            Displays the number of gallons needed
            Computes the price based on a paint price of $32 per gallon, assuming that the painter can buy any fraction of a gallon of paint at the same price as 
            a whole gallon
            Returns the price to the main() method
        The main() method displays the final price. For example, the cost to paint a 15-by-20-foot room with 10-foot ceilings is $64.

      Author: Kiara Bilyk
      Date:   02-26-2025

      Filename: PaintCalculator.java
*/
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get input for length
        System.out.println("Enter length of room: ");
        double length = scan.nextDouble();
        // Get input for width
        System.out.println("Enter width of room: ");
        double width = scan.nextDouble();
        // Get input for height
        System.out.println("Enter height of room: ");
        double height = scan.nextDouble();

        // Call method to find price
        double price = calculatePrice(length, width, height);

        // Check if the price is not a whole number
        int intPrice = (int) price;  // Convert to int (truncates decimals)
        if (price > intPrice) {
            intPrice += 32;  // Add $32 if the price is not a whole number
        }
        // Output price
        System.out.print("The cost to paint a " + (int)length + "-by-" + (int)width + "-foot room with " + (int)height + "-foot ceilings is $" + intPrice + ".");
        scan.close();
    }

    // Method that returns the price
    public static double calculatePrice(double length, double width, double height) {
        double area = (2 * (length*height)) + (2 * (width*height));
        double gallons = calculateGallons(area);
        System.out.println(gallons + " gallons are needed.");
        return (gallons*32);

    }
    // Method that calulates the gallons need for the wall area
    public static double calculateGallons(double area) {
        return (area/350);
    }
}