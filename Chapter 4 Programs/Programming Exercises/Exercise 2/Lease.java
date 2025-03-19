/*    Java Programming 10th Edition
      Chapter 4
      Exercises 04-02a

       Create a class named Lease with fields that hold an apartment tenant’s name, apartment number, monthly rent amount, and term of 
       the lease in months. Include a default constructor that initializes the name to XXX, the apartment number to 0, the rent to 1000, 
       and the term to 12. Also include methods to get and set each of the fields. Include a nonstatic method named addPetFee() that adds 
       $10 to the monthly rent value and calls a static method named explainPetPolicy() that explains the pet fee.

      Author: Kiara Bilyk
      Date:   03-05-2025

      Filename: Lease.java
*/
import javax.swing.JOptionPane;

public class Lease {
    String tenantName; // Name of Tenant
    int aptNum; // Apartment Number
    int monthlyRent; // Monthly Rent
    int leaseMonths; // Term of Lease in Months

    Lease() { // Default Constructor
        tenantName = "XXX";
        aptNum = 0;
        monthlyRent = 1000;
        leaseMonths = 12;
    }

    // Input and Set Methods
    public void inputName() { // Sets tenantName
        tenantName = JOptionPane.showInputDialog(null, "Enter tenant name:");
    }
    public void inputAptNum() { // Sets aptNum
        System.out.print("Enter apartment number: ");
        aptNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter apartment number:"));
    }
    public void inputRent() { // Sets monthlyRent
        monthlyRent = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter monthly rent:"));
    }
    public void inputLease() { // Sets leaseMonths
        System.out.print("Enter term of the lease in months: ");
        leaseMonths = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter term of lease in months:"));
    }
    // Adds the "Pet Fee" to the Rent and Calls explainPetPolicy()
    public void addPetFee() {
        monthlyRent += 10;
        explainPetPolicy();
    }
    // Prints a String to Explain that Pet Rent was Added
    public static void explainPetPolicy() {
        JOptionPane.showMessageDialog(null, "$10 has been added to the monthly rent because of the Pet Policy");
    }
}
