/*    Java Programming 10th Edition
      Chapter 8
      Exercises 08-02

       Allow a user to enter any number of double values up to 15. The user should enter 99999 to quit entering numbers. Display an error message if the user quits 
       without entering any numbers; otherwise, display a count of the numbers entered, the arithmetic average of the numbers, and each entered value and its 
       distance from the average.

      Author: Kiara Bilyk
      Date:   04-16-2025

      Filename: BabyNameComparison.java
*/
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int MAX_LENGTH = 15; // Max Number of Input
        final int EXIT = 99999; // Exit Number
        double input;
        int count = 0;

        double[] nums = new double[15]; // Double Array to Store Input

        // Get Starting Input
        System.out.print("Enter a double: ");
        input = scan.nextDouble();

        // Error Message if Exited Before at Least One Double Entered
        while (input == EXIT) {
            System.out.print("Enter at least one double: ");
            input = scan.nextDouble();
        }

        // Loop Until Exited
        while (input != EXIT) {
            if (count < MAX_LENGTH && count != (MAX_LENGTH-1)) { // Check if Under Max Length and if the 14th Input was Entered
                nums[count] = input; // Sets Element to input at correct Subscript
                count++;
                // Get next input
                System.out.print("Enter another double or " + EXIT + " to exit: ");
                input = scan.nextDouble();
            }
            else if (count == (MAX_LENGTH-1)) { // Checks if 14th input was Entered
                nums[count] = input;
                count++;
            }
            else {
                input = EXIT; // If Max Length sets input to EXIT
            }
        }
        double avg = calculateAverage(nums, count); // Calulates Average and Stores Value Returned

        System.out.println("Number of doubles entered: " + count); // Prints Amount of Inputs
        System.out.println("Average of doubles entered: " + avg); // Prints Average
        System.out.println("Distance from average:");
        displayDistance(nums, avg); // Prints Every Entered Double and the Distance from Average
        
    }

    // Finds the Average and Returns the Value
    public static double calculateAverage(double[] numbers, int count) {
        double sum = 0;
        double average;

        // Loops Through Array to Calulate Mean
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        average = sum/count;
        return average;
    }

    // Displays the Distance from Average for Every Input
    public static void displayDistance (double [] numbers, double average) {
        for (double val : numbers) {
            if (val != 0.0) {
                double distance = val - average;
                System.out.println(val + " has a distance of " + distance);
            }
        }
    }
}
