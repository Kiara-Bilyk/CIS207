/*    Java Programming 10th Edition
      Chapter 9
      Exercises 09-01a

       Create a class named Horse that contains data fields for the name, color, and birth year. Include get and set methods for these fields.

      Author: Kiara Bilyk
      Date:   04-30-2025

      Filename: Horse.java
*/
public class Horse {
    private String name, color;
    private int birthYear;

    public String getName() { // Returns name
        return name;
    }
    public String getColor() { // Returns color
        return color;
    }
    public int getBirthYear() { // Returns birthYear
        return birthYear;
    }

    public void setName(String name) { // Sets name
        this.name = name;
    }
    public void setColor(String color) { // Sets color
        this.color = color;
    }
    public void setBirthYear(int year) { // Sets birthYear
        birthYear = year;
    }
}
