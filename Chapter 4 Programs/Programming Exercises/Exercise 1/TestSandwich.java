/*    Java Programming 10th Edition
      Chapter 4
      Exercises 04-01b

       Create an application named TestSandwich that prompts the user for data, instantiates one Sandwich object, and displays its 
       values.

      Author: Kiara Bilyk
      Date:   02-05-2025

      Filename: TestSandwich.java
*/
import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ingredient;
        String bread;
        double price;

        Sandwich mySandwich = new Sandwich(); // New object of Sandwich class

        // Get input for ingredient
        System.out.print("Enter main ingredient: ");
        ingredient = scan.next();
        // Get input for bread
        System.out.print("Enter bread type: ");
        bread = scan.next();
        // Get input for price
        System.out.print("Enter price: ");
        price = scan.nextDouble();

        // Set inputs to object variables
        mySandwich.setMainIngredient(ingredient);
        mySandwich.setBread(bread);
        mySandwich.setPrice(price);
        
        // Output
        System.out.println("Bread Type: " + mySandwich.getBread());
        System.out.println("Main ingredient: " + mySandwich.getMainIngredients());
        System.out.println("Price: $" + mySandwich.getPrice());
    }
}
