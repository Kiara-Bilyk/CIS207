/* In the ChiliToGo program, the costs to produce an adult’s meal and a child’s meal are $4.35 and $3.10, respectively. Modify the ChiliToGo program to 
display the total profit for each type of meal as well as the grand total profit. Save the program as ChiliToGoProfit.java.

/*    Java Programming 10th Edition
      Chapter 1
      Exercises 02-08b

       In the ChiliToGo program, the costs to produce an adult’s meal and a child’s meal are $4.35 and $3.10, respectively. Modify the ChiliToGo program 
       to display the total profit for each type of meal as well as the grand total profit.

      Author: Kiara Bilyk
      Date:   02-10-2025

      Filename: ChiliToGoProfit.java
*/

import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        final int ADULT_PRICE = 7;
        final int CHILD_PRICE = 4;
        final double ADULT_COST = 4.35;
        final double CHILD_COST = 3.10;
        System.out.println("Enter number of adult meals: ");
        Scanner scan = new Scanner(System.in);
        int adultMeals = scan.nextInt();
        System.out.println("Enter number of children meals: ");
        int childMeals = scan.nextInt();
        System.out.println("The profit is $" + ((adultMeals*ADULT_PRICE)-(adultMeals*ADULT_COST)) + " for the adult meals and $" + ((childMeals*CHILD_PRICE)-(childMeals*CHILD_COST)) + " for the children meals for a total profit of $" + (((adultMeals*ADULT_PRICE)-(adultMeals*ADULT_COST))+((childMeals*CHILD_PRICE)-(childMeals*CHILD_COST))) + ".");
        scan.close();
    }
}