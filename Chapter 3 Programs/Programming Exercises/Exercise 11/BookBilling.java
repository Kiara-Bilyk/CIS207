/*    Java Programming 10th Edition
      Chapter 3
      Exercises 03-11

        Create a class named BookBilling that includes three overloaded computeBill() methods for the Happy Memories Company, which sells photo books.
            When computeBill() receives no parameters, the method computes the price of one photo book at $14.99, adds 8 percent tax, and returns the total due.
            When computeBill() receives one parameter, it represents the quantity ordered. Multiply the value by $14.99, add 8 percent tax, and return the total due.
            When computeBill() receives two parameters, they represent the quantity ordered and a coupon value. Multiply the quantity by $14.99, reduce the result by 
                the coupon value, add 8 percent tax, and then return the total due.
        Write a main() method that prompts the user for the number of books ordered, prompts for a coupon value, and tests all three overloaded methods. 

      Author: Kiara Bilyk
      Date:   02-26-2025

      Filename: BookBilling.java
*/
import java.util.Scanner;

public class BookBilling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get input for numOrdered
        System.out.println("Enter number of photo books ordered: ");
        int numOrdered = scan.nextInt();
        // Get input for couponValue
        System.out.println("Enter value of coupon: ");
        double couponValue = scan.nextInt();

        //Output
        System.out.printf("Price per Photo Book + Tax : $%.2f", computeBill());
        System.out.printf("\nPrice before Coupon : $%.2f", computeBill(numOrdered));
        System.out.printf("\nTotal : $%.2f", computeBill(numOrdered, couponValue));
        
        scan.close();
    }

    // Method that returns the price of one photo book plus tax
    public static double computeBill() {
        return (14.99 * 1.08);
    }
    // Method that returns the price of photo books ordered plus tax
    public static double computeBill(int ordered) {
        return ((ordered * 14.99) * 1.08);
    }
    // Method that returns the price of photo books ordered minus coupons plus tax
    public static double computeBill(int ordered, double coupon) {
        return (((ordered * 14.99) - coupon) * 1.08);
    }
}