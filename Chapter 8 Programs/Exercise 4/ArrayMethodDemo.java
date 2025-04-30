/*    Java Programming 10th Edition
      Chapter 8
      Exercises 08-04

       Create an application that prompts a user for 10 integers and stores them in an array. The application should call five methods that in turn:
        a. display all the integers,
        b. display all the integers in reverse order,
        c. display all values less than 12 or a message if none are less than 12, and
        d. display all values that are higher than the calculated average value.

      Author: Kiara Bilyk
      Date:   04-28-2025

      Filename: ArrayMethodDemo.java
*/
import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10]; // Integer Array

        // for Loop to Get and Set Input
        for (int count = 0; count <= 9; count++){
            System.out.print("Enter Integer " + (count+1) + ": ");
            numbers[count] = scan.nextInt();
        }

        displayNumbers(numbers); // Displays Each Number in the Array
        displayReverseNumbers(numbers); // Displays Each Number in the Array in Reverse Order
        displayUnderTwelve(numbers); // Displays Each Number in the Array Less than Twelve
        displayOverAverage(numbers); // Displays Each Number in the Array Greater than the Average
    }

    // Method to Display Each Number in the Array
    static void displayNumbers(int[] nums) {
        System.out.println("Integers:");
        System.out.print("\t");
        System.out.println(nums[0] + " " 
            + nums[1] + " "
            + nums[2] + " "
            + nums[3] + " "
            + nums[4] + " "
            + nums[5] + " "
            + nums[6] + " "
            + nums[7] + " "
            + nums[8] + " "
            + nums[9] + " ");
    }

    // Method to Display Each Number in the Array in Reverse Order
    static void displayReverseNumbers(int[] nums){
        System.out.println("Reverse Integers:");
        System.out.print("\t");
        System.out.println(nums[9] + " " 
        + nums[8] + " "
        + nums[7] + " "
        + nums[6] + " "
        + nums[5] + " "
        + nums[4] + " "
        + nums[3] + " "
        + nums[2] + " "
        + nums[1] + " "
        + nums[0] + " ");
    }

    // Method to Display Each Number in the Array Less than Twelve
    static void displayUnderTwelve(int[] nums){
        System.out.println("Integers Under Twelve:");
        System.out.print("\t");
        int count = 0;
        int loop = 0;

        // Loops Through Array to check under Twelve
        for (int val : nums) {
            // Checks if Under Twelve
            if (val <= 12){
                if (loop != 9) {
                    System.out.print(val + " ");
                    count++;
                    loop++;
                }
                else {
                    System.out.println(val);
                }
            }
        }
        if (count == 0) {
            System.out.println("There are no numbers under 12.");
        }
    }

    // Method to Display Each Number in the Array Greater than the Average
    static void displayOverAverage(int[] nums) {
        System.out.println("Integers Over Average:");
        System.out.print("\t");
        int sum = 0;
        int loop = 0;
        int average;

        // Loops Through Array to Calulate Average
        for (int val : nums) {
            sum += val;
        }
        average = sum/10;

        // Loops Through Array to Display Greater than Average
        for (int val : nums) {
            if (val > average){
                if (loop != 9) {
                    System.out.print(val + " ");
                    loop++;
                }
                else {
                    System.out.println(val);
                }
            }
        }
    }
}
