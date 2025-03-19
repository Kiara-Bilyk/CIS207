/*    Java Programming 10th Edition
      Chapter 4
      Case Problem 04-01a

       Create a class to hold Event data for Yummy Catering. The class contains the following:
        - Two public final static fields that hold the price per guest ($35) and the cutoff value for a large event (50 guests).
        - Three private fields that hold an event number, number of guests for the event, and the price. The event number is stored as a String because the company 
            plans to assign event numbers such as M312.
        - Two public set methods that set the event number (setEventNumber()) and the number of guests (setGuests()). The price does not have a set method because the 
            setGuests() method will calculate the price as the number of guests multiplied by the price per guest every time the number of guests is set.
        - Three public get methods that return the values in the three nonstatic fields.
        - A constructor that accepts an event number and number of guests as parameters. Pass these values to the setEventNumber() and setGuests() methods, respectively. 
            The setGuests() method will automatically calculate the event price.
        - Another constructor that is a default constructor that passes A000 and 0 to the two-parameter constructor.

      Author: Kiara Bilyk
      Date:   03-18-2025

      Filename: Event.java
*/

public class Event {
    public final static int PRICE_PER_GUEST = 35; // $35 per guest
    public final static int LARGE_EVENT_NUMBER = 50; // 50 guests is large group

    private String eventNum; // Event Number (Ex: M312)
    private int guestNum; // Number of Guests at Event
    private int price; // Total Price of Event

    // Constructor that calls set methods
    Event(String event, int guests) {
        setEventNumber(event);
        setGuests(guests);
    }
    Event() {
        this("A000", 0); // Default Constructor
    }

    // Set Methods
    public void setEventNumber(String event) { // Sets eventNum To Passed In String
        eventNum = event;
    }
    public void setGuests(int guest) { // Set guestNum To Passed In Int and Calulates and Sets price
        guestNum = guest;
        price = (guestNum*PRICE_PER_GUEST);
    }

    // Get Methods
    public String getEventNumber() { //Returns eventNum
        return eventNum;
    }
    public int getGuestNumber() { // Returns guestNum
        return guestNum;
    }
    public int getPrice() { // Returns Price
        return price;
    }
}