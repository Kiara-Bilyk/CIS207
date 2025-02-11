/* In the ChiliToGo program, the costs to produce an adult’s meal and a child’s meal are $4.35 and $3.10, respectively. Modify the ChiliToGo program to 
display the total profit for each type of meal as well as the grand total profit. Save the program as ChiliToGoProfit.java.

/*    Java Programming 10th Edition
      Chapter 1
      Exercises 02-08a

       The Huntington Boys and Girls Club is conducting a fundraiser by selling chili dinners to go. The price is $7 for an adult’s meal 
       and $4 for a child’s meal. Write a program that accepts the number of each type of meal ordered, and display the total money collected 
       for adults’ meals, children’s meals, and all meals.

      Author: Kiara Bilyk
      Date:   02-07-2025

      Filename: ChiliToGo.java
*/

import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final int ADULT_PRICE = 7;
        final int CHILD_PRICE = 4;
        System.out.println("Enter number of adult meals: ");
        Scanner scan = new Scanner(System.in);
        int adultMeals = scan.nextInt();
        System.out.println("Enter number of children meals: ");
        int childMeals = scan.nextInt();
        System.out.println("The total is $" + (adultMeals*ADULT_PRICE) + " for the adult meals and $" + (childMeals*CHILD_PRICE) + " for the children meals for a total of $" + ((adultMeals*ADULT_PRICE)+(childMeals*CHILD_PRICE)) + ".");
        scan.close();
    }
}