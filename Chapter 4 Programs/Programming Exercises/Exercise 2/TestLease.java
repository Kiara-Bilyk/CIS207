/*    Java Programming 10th Edition
      Chapter 4
      Exercises 04-02b

       Create a class named TestLease whose main() method declares four Lease objects named lease1, lease2, lease3, and lease4. Create 
       a getData() method that prompts a user for values for each field for a Lease, and return a newly constructed Lease object to the 
       main() method, where it is assigned to one of main()’s first three Lease objects. Do not prompt the user for values for the 
       fourth Lease object, but let it hold the default values. After the four Lease objects have been assigned values, pass the lease1 
       object to a showValues() method that displays the data. Then call the addPetFee() method with the lease1 object, and confirm 
       that the fee explanation statement is displayed. Next, call the showValues() method for the lease1 object again and confirm that 
       the pet fee has been added to the rent. Finally, call the showValues() method with each of the other three objects. Confirm that 
       three hold the values you supplied as input and one holds the constructor default values.

      Author: Kiara Bilyk
      Date:   03-05-2025

      Filename: TestLease.java
*/

import javax.swing.JOptionPane;

public class TestLease {
    public static void main(String[] args) {
        Lease lease1, lease2, lease3;
        Lease lease4 = new Lease();
        lease1 = getData();
        lease2 = getData();
        lease3 = getData();
        showValues(lease1);
        lease1.addPetFee();
        showValues(lease1);
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }

    public static Lease getData() {
        Lease myLease = new Lease();
        myLease.inputName();
        myLease.inputAptNum();
        myLease.inputRent();
        myLease.inputLease();
        return myLease;
    }

    public static void showValues(Lease theLease) {
        JOptionPane.showMessageDialog(null, "Name of Tenent: " + theLease.tenantName + "\nApartment Number: " + theLease.aptNum +"\nMonthly Rent: $" + theLease.monthlyRent + "\nLease Term: " + theLease.leaseMonths + " months");
    }
}
