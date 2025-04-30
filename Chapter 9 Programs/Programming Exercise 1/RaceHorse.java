/*    Java Programming 10th Edition
      Chapter 9
      Exercises 09-01b

       Create a subclass of Horse named RaceHorse, which contains an additional field that holds the number of races in which the Horse has competed and additional 
       methods to get and set the new field.

      Author: Kiara Bilyk
      Date:   04-30-2025

      Filename: RaceHorse.java
*/
public class RaceHorse extends Horse {
    int numRace;

    public int getNumRace() { // Returns numRace
        return numRace;
    }

    public void setNumRace(int numberRace) { // Sets numRace
        numRace = numberRace;
    }
}
