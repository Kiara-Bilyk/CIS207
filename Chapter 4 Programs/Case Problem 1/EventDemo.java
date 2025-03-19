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
import javax.swing.JOptionPane;

public class EventDemo {
    public static void main(String[] args) {
        Event firstEvent = new Event(); // Event object with default;

        // Get Input For eventNumber
        String eventNumber = JOptionPane.showInputDialog(null,"Enter Event Number:");
        // Get input for guests
        int guests = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Guests:"));
        Event secondEvent = new Event(eventNumber, guests); // Event object With Input

        displayDetails(firstEvent);
        displayDetails(secondEvent);
    }
    //Method That Displays the Fields in Each Object Passed
    public static void displayDetails(Event myevent) {
        JOptionPane.showMessageDialog(null, "Event Details: \nEvent Number: " + myevent.getEventNumber() + "\nNumber of Guests: " + myevent.getGuestNumber() + "Price of Event: $" + myevent.getPrice());
    }
}
