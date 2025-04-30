/*    Java Programming 10th Edition
      Chapter 8
      Exercises 08-12a

       The mean of a list of numbers is its arithmetic average. The median of a list is its middle value when the values are placed in order. For example, if an 
       ordered list contains 1, 2, 3, 4, 5, 6, 10, 11, and 12, then the mean is 6, and their median is 5. Write an application that allows you to enter nine integers 
       and displays the values, their mean, and their median.

      Author: Kiara Bilyk
      Date:   04-29-2025

      Filename: MeanMedian.java
*/
import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int MEDIAN_ARRAY_NUM = 4; // The Subscript of the Middle Element
        
        int[] numbers = new int[9]; // int Array that Will Hold the Input

        // Get input
        for (int count = 0; count < 9; count++){
            System.out.print("Enter Integer " + (count + 1) + ": ");
            numbers[count] = scan.nextInt();
        }

        Arrays.sort(numbers); // Sorts Array
        System.out.println("Median: " + numbers[MEDIAN_ARRAY_NUM]); // Print Median
        System.out.println("Mean: " + calculateMean(numbers)); // Print Mean

    }

    // Calulates Mean and Returns the Value
    public static double calculateMean(int[] nums) {
        int sum = 0;
        double average;

        // Loops Through Array to Calulate Mean
        for (int val : nums) {
            sum += val;
        }
        average = sum/nums.length;
        return average;
    }
}
