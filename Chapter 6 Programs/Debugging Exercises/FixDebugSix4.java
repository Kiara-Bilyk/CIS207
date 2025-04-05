// Displays the mid-point between 
// (and including) user-specified values
import java.util.Scanner;
public class FixDebugSix4
{
   public static void main(String[] args)
   {
      int high, low;
      int sum;
      double half, midPoint;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number >> ");
      low = input.nextInt();
      System.out.print("Enter a larger number >> ");
      high = input.nextInt();
      while(low >= high)
      {
         System.out.println("The number you entered for a high number, " +
            high + ", is not more than " + low);
         System.out.print("Enter a number higher than " + low + " >> ");
         high = input.nextInt();
      }
      sum = high + low;
      half = sum / 2;
      midPoint = half;
      System.out.println(midPoint + " is halfway between " +
         low + " and " + high);
   }
}
