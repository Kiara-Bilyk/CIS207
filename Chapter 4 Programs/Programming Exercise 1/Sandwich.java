/*    Java Programming 10th Edition
      Chapter 4
      Exercises 04-01a

       Create a class named Sandwich. Data fields include a String for the main ingredient (such as tuna), a String for bread type 
       (such as wheat), and a double for price (such as 4.99). Include methods to get and set values for each of these fields.

      Author: Kiara Bilyk
      Date:   02-05-2025

      Filename: Sandwich.java
*/
import java.util.Scanner;

public class Sandwich {
    Scanner scan = new Scanner(System.in);
    String mainIngredient;
    String breadType;
    double price;

    public void inputIngredient() {
        System.out.print("Enter main ingredient: ");
        mainIngredient = scan.next();
    }

    public void inputBread() {
        System.out.print("Enter bread type: ");
        breadType = scan.next();
    }
    public void inputPrice() {
        System.out.print("Enter price: ");
        price = scan.nextDouble();
    }
}