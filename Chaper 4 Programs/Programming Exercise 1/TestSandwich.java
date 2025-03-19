/*    Java Programming 10th Edition
      Chapter 4
      Exercises 04-01b

       Create an application named TestSandwich that prompts the user for data, instantiates one Sandwich object, and displays its 
       values.

      Author: Kiara Bilyk
      Date:   02-05-2025

      Filename: TestSandwich.java
*/

public class TestSandwich {
    public static void main(String[] args) {
        Sandwich mySandwich = new Sandwich();
        mySandwich.inputBread();
        mySandwich.inputIngredient();
        mySandwich.inputPrice();
        System.out.println("Bread Type: " + mySandwich.breadType);
        System.out.println("Main ingredient: " + mySandwich.mainIngredient);
        System.out.println("Price: $" + mySandwich.price);
    }
}
