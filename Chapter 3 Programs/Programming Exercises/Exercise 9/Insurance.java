/*    Java Programming 10th Edition
      Chapter 3
      Exercises 03-09

        The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year. The premium is 
        computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20. For example, a 34-year-old would pay $360, which is calculated 
        by adding the decades (3) to 15 and then multiplying by 20. Write an application that prompts a user for the current year and a birth year. Pass both to a 
        method that calculates and returns the premium amount, and then display the returned amount. 

      Author: Kiara Bilyk
      Date:   02-26-2025

      Filename: Insurance.java
*/
import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get input for currentYear
        System.out.println("Enter current year: ");
        int currentYear = scan.nextInt();
        // Get input for birthYear
        System.out.println("Enter birth year: ");
        int birthYear = scan.nextInt();
        int premium = calculatePremium(currentYear, birthYear);
        System.out.println("Current Year : " + currentYear);
        System.out.println("Birth Year : " + birthYear);
        System.out.println("Policy Premium: $" + premium);

        scan.close();
    }

    // Method that returns the price
    public static int calculatePremium(int current, int birth) {
        int age = current - birth;
        int price = ((age / 10) + 15) * 20;
        return price;
    }
}