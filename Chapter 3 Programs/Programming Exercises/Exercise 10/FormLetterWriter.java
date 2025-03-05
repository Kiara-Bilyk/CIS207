/*    Java Programming 10th Edition
      Chapter 3
      Exercises 03-10

        Create a class named FormLetterWriter that includes two overloaded methods named displaySalutation(). The first method takes one String parameter that 
        represents a customer’s first name, and it displays the salutation Dear followed by the first name. The second method accepts two String parameters that 
        represent a first and last name, and it displays the greeting Dear followed by the first name, a space, and the last name. After each salutation, display 
        the rest of a short business letter: Thank you for your recent order. Write a main() method that prompts the user for a first and last name and tests each 
        overloaded method.

      Author: Kiara Bilyk
      Date:   02-26-2025

      Filename: FormLetterWriter.java
*/
import java.util.Scanner;

public class FormLetterWriter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get input for firstName
        System.out.println("Enter first name: ");
        String firstName = scan.next();
        // Get input for lastName
        System.out.println("Enter last name: ");
        String lastName = scan.next();
        displaySalutation(firstName);
        displaySalutation(firstName, lastName);
        
        scan.close();
    }

    // Method that returns the price
    public static void displaySalutation(String firstName) {
        System.out.println("Dear " + firstName + ",");
        System.out.println("Thank you for your recent order.");
    }
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.");
    }
}