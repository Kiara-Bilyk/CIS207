/*    Java Programming 10th Edition
      Chapter 3
      Exercises 03-03

       Create an application named NumbersDemo whose main() method holds two integer variables. Prompt the user for values 
       for the variables. In turn, pass each value to methods named displayTwiceTheNumber(), displayNumberPlusFive(), and 
       displayNumberSquared(). Create each method to perform the task its name implies.

      Author: Kiara Bilyk
      Date:   02-25-2025

      Filename: NumbersDemo.java
*/
import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();

        // First number outputs
        System.out.println("Your first number is " + num1 + ":");
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        
        // Second number outputs
        System.out.println("Your second number is " + num2 + ":");
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
        scan.close();
    }
    public static void displayTwiceTheNumber(int num) {
        System.out.println("\tTwice the number: " + (num * 2));
    }
    public static void displayNumberPlusFive(int num) {
        System.out.println("\tNumber plus five: " + (num + 5));
    }
    public static void displayNumberSquared(int num) {
        System.out.println("\tNumber squared: " + (num*num));
    }
}