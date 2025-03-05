/*    Java Programming 10th Edition
      Chapter 3
      Exercises 03-08

        The Renew Your Home Company estimates each job cost as the cost of materials plus $35 per hour while on the job, plus $12 per hour for travel time to the 
        job site. Create a class that contains a main() method that prompts the user for the name of a job (for example, Patel bathroom remodel), the cost of 
        materials, the number of hours of work required, and the number of hours of travel time. Pass the numeric data to a method that computes an estimate for the 
        job and returns the computed value to the main() method, where the job name and estimated price are displayed.  

      Author: Kiara Bilyk
      Date:   02-26-2025

      Filename: JobPricing.java
*/
import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Get input for jobName
        System.out.println("Enter job name: ");
        String jobName = scan.nextLine();
        // Get input for materialCost
        System.out.println("Enter material cost: ");
        int materialCost = scan.nextInt();
        // Get input for workHours
        System.out.println("Enter hours of work required: ");
        int workHours = scan.nextInt();
        // Get input for travelHours
        System.out.println("Enter hours of travel required: ");
        int travelHours = scan.nextInt();


        int cost = calculateCost(materialCost, workHours, travelHours);
        System.out.println("Job Name : " + jobName);
        System.out.println("Material Cost : " + materialCost);
        System.out.println("Hours of Work Required : " + materialCost);
        System.out.println("Hours of Travel Required: " + travelHours);
        System.out.println("Cost of Job: $" + cost);
        scan.close();
    }

    // Method that returns the cost
    public static int calculateCost(int material, int work, int travel) {
        int cost = material + (work * 35) + (travel * 12);
        return cost;
    }
}