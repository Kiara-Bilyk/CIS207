/*    Java Programming 10th Edition
      Chapter 3
      Game Zone 03-02

       Write a program that declares final values for MIN and MAX within its main() method and passes the values to a method that displays a message asking the 
       user to guess a value between MIN and MAX. Accept the user’s guess and return it to the main() method. Set a boolean variable to true if the user guessed 
       the value and false if the user did not guess the value. Call a method that accepts the random value, the user’s guess value, and the boolean value and then 
       displays all the values as well as how far away the user’s guess was from the random number.

      Author: Kiara Bilyk
      Date:   02-26-2025

      Filename: RandomGuessMatchWithMethods.java
*/

import java.util.Scanner;

public class RandomGuessMatchWithMethods {
    public static void main(String[] args) {
      final int MIN = 1;
      final int MAX = 10;
      boolean isCorrect = false;
      int random = (MIN + (int)(Math.random() * MAX));
      int guess = inputGuess(MIN, MAX);
      if (random == guess) {
        isCorrect = true;
      }
      outputCorrect(random, guess, isCorrect);
    }
    public static int inputGuess(final int MIN, final int MAX) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Guess a number between " + MIN + " and " + MAX +": ");
      int guess = scan.nextInt();
      scan.close();
      return guess;
    }
    public static void outputCorrect(int num, int guess, boolean correct) {
      if (correct){
        System.out.println("Congrats! You guessed the number! You guessed " + guess + ".");
      }
      else {
        System.out.println("Sorry. The number was " + num + " and your guess was " + guess + ".");
      System.out.println("You were " + (num-guess) + " away from the number.");
      
      }
    }
}