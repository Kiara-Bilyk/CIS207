/*    Java Programming 10th Edition
      Chapter 4
      Exercises 04-01a

       Create a class named Sandwich. Data fields include a String for the main ingredient (such as tuna), a String for bread type 
       (such as wheat), and a double for price (such as 4.99). Include methods to get and set values for each of these fields.

      Author: Kiara Bilyk
      Date:   02-05-2025

      Filename: Sandwich.java
*/


public class Sandwich {
    String mainIngredient;
    String breadType;
    double price;

    public void setMainIngredient(String ingredient) {
        mainIngredient = ingredient;
    }
    public String getMainIngredients(){
        return mainIngredient;
    }

    public void setBread(String bread) {
        breadType = bread;
    }
    public String getBread(){
        return breadType;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    
}
