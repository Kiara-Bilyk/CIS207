/*    Java Programming 10th Edition
      Chapter 5
      Exercises 05-01
      
       Write an application that asks a user to enter an integer. Pass the integer to a method that determines whether the number is even and returns a Boolean value. 
       Display a statement that indicates whether the integer is even or odd.

      Author: Kiara Bilyk
      Date:   03-31-2025

      Filename: EvenOdd.java
*/
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Even or Odd:");
        System.out.println("====================");
        System.out.print("Enter number to check: ");
        int num = scan.nextInt();
        boolean even = checkEvenOdd(num);
        if (even){
            System.out.println("Your number (" + num + ") is even.");
        }
        else {
            System.out.println("Your number (" + num + ") is odd.");
        }
       
    }

    public static boolean checkEvenOdd(int num) {
        return num%2 == 0;
    }
}
