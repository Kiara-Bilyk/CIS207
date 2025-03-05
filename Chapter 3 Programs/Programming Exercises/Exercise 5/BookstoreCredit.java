/*    Java Programming 10th Edition
      Chapter 3
      Exercises 03-05

       To encourage good grades, Hermosa High School has decided to award each student a bookstore credit that is 10 times the student’s grade point average. 
       In other words, a student with a 3.2 grade point average receives a $32 credit. Create a class that prompts a student for a name and grade point average 
       and then passes the values to a method that displays a descriptive message. The message uses the student’s name, echoes the grade point average, and 
       computes and displays the credit. 

      Author: Kiara Bilyk
      Date:   02-25-2025

      Filename: BookstoreCredit.java
*/
import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Get input
        System.out.println("Enter name: ");
        String name = scan.next();
        System.out.println("Enter GPA: ");
        double gpa = scan.nextDouble();
        displayCredit(name, gpa);

        scan.close();
    }
    public static void displayCredit(String name, double gpa) {
        int credit = (int)(gpa * 10);
        System.out.println("Student: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Bookstore Credit: $" + credit);
    }
}