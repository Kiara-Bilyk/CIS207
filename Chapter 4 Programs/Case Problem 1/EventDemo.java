/*    Java Programming 10th Edition
      Chapter 4
      Case Problem 04-01b

       Create an application that declares two Event objects.
        - One Event object uses the default constructor.
        - The other Event object is constructed from values input by a user.
        - Display the details of each object by passing them, in turn, to a method named displayDetails()

      Author: Kiara Bilyk
      Date:   03-18-2025

      Filename: EventDemo.java
*/
import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        Event firstEvent = new Event(); // Event object with default;

        Scanner scan = new Scanner(System.in); // Scanner object
        // Get Input For eventNumber
        System.out.print("Enter Event Number: ");
        String eventNumber = scan.next();
        // Get input for guests
        System.err.print("Enter Number of Guests: ");
        int guests = scan.nextInt();
        scan.nextLine(); // Consume the newline
        Event secondEvent = new Event(eventNumber, guests); // Event object With Input
        scan.close();

        displayDetails(firstEvent);
        displayDetails(secondEvent);
    }
    //Method That Displays the Fields in Each Object Passed
    public static void displayDetails(Event myevent) {
        System.out.println("\nEvent Details:");
        System.out.println("Event Number: " + myevent.getEventNumber());
        System.out.println("Number of Guests: " + myevent.getGuestNumber());
        System.out.println("Price of Event: $" + myevent.getPrice());
        System.out.println("-----------------------------");
    }
}