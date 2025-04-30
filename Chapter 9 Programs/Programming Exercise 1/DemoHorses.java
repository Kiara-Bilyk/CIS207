/*    Java Programming 10th Edition
      Chapter 9
      Exercises 09-01c

       Write an application that prompts the user for appropriate field values and demonstrates using objects of each class, Horse and RaceHorse.

      Author: Kiara Bilyk
      Date:   04-30-2025

      Filename: DemoHorses.java
*/
import java.util.Scanner;

public class DemoHorses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Horse myHorse = new Horse(); // New Instance of Horse Class
        RaceHorse myRaceHorse = new RaceHorse(); // New Instance of RaceHorse Class

        // Input Horse
        System.out.print("Enter the name of the horse: ");
        myHorse.setName(scan.next()); // Sets Name
        System.out.print("Enter the color of the horse: ");
        myHorse.setColor(scan.next()); // Sets Color
        System.out.print("Enter the birth year of the horse: ");
        myHorse.setBirthYear(scan.nextInt()); // Sets Birth Year

        System.out.println("========================================");

        // Input RaceHorse
        System.out.print("Enter the name of the race horse: ");
        myRaceHorse.setName(scan.next()); // Sets Name
        System.out.print("Enter the color of the race horse: ");
        myRaceHorse.setColor(scan.next()); // Sets Color
        System.out.print("Enter the birth year of the race horse: ");
        myRaceHorse.setBirthYear(scan.nextInt()); // Sets Birth Year
        System.out.print("Enter the number of races: ");
        myRaceHorse.setNumRace(scan.nextInt()); // Set Number of Races

        // Output Horse
        System.out.println("Your Horse: ");
        System.out.println("\tName: " + myHorse.getName()); // Prints Name
        System.out.println("\tColor: " + myHorse.getColor()); // Prints Color
        System.out.println("\tBirth Year: " + myHorse.getBirthYear()); // Prints Birth Year

        // Output RaceHorse
        System.out.println("Your Race Horse: ");
        System.out.println("\tName: " + myRaceHorse.getName()); //Prints Name
        System.out.println("\tColor: " + myRaceHorse.getColor()); // Prints Color
        System.out.println("\tBirth Year: " + myRaceHorse.getBirthYear()); // Prints Birth Year
        System.out.println("\tNumber of Races: " + myRaceHorse.getNumRace()); // Prints Number of Races
    }
}
