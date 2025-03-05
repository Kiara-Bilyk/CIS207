/*    Java Programming 10th Edition
      Chapter 3
      Exercises 03-04

       Create an application named Percentages whose main() method holds two double variables, and prompt the user for values. 
       Pass both variables to a method named computePercent() that displays the two values and the value of the first number as 
       a percentage of the second one. For example, if the numbers are 2.0 and 5.0, the method should display a statement similar 
       to 2.0 is 40 percent of 5.0. Then call the method a second time, passing the values in reverse order.

      Author: Kiara Bilyk
      Date:   02-25-2025

      Filename: Percentages.java
*/
import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Get input for two doubles
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = scan.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scan.nextDouble();

        computePercent(num1, num2);
        computePercent(num2, num1);
        scan.close();
    }
    public static void computePercent(double num1, double num2) {
        int percent = (int)((num1/num2)*100);
        System.out.println(num1 + " is "+ percent + " percent of " + num2);
    }
}