/* File       Guitar.java
 * Author:    Matthew.Dwyer
 * Date:      31 Jan 2018
 * Purpose:   Complete 2nd Homework Assignment
 */

/** Design a java class named Guitar that contains:.
*   A private int data field named numStrings that defines the number of strings on the
*   guitar. The default value should be 6.
*   A private double data field named guitarLength that defines the length of the guitar in
*   inches. The default value should be 28.2
*   A private String data field named guitarManufacturer that defines the manufacturer of
*   the guitar. The default value should be “Gibson”.
*   A private Color data field named guitarColor that defines the color of the guitar. The
*   default value should be Color.Red.
*   A no argument constructor that creates a Guitar using the default number of strings,
*   length, manufacturer and color.
*   A constructor that creates a Guitar using a specified number of strings, length,
*   manufacturer and color.
*   Getter methods for all data fields.
*   A playGuitar() method that returns a string representation of 16 randomly selected
*   musical notes of random duration. For example, the first part of the string returned
*   might look like this: [A(2), G(3), B(0.5), C(1), C(1), D(0.25), ...]. You can assume one
*   octave in the key of C where valid notes include A, B, C, D, E, F and G and duration
*   values are .25, .5, 1, 2, and 4 representing sixteenth notes, eighth notes, quarter notes,
*   half notes and whole notes, respectively.
*   A toString() method that displays the number of strings, length, manufacturer and color
*   in String format
*/
import java.util.Random;

public class Guitar{
  private int numStrings;
  private double guitarLength;
  private String guitarManufacturer;
  private String guitarColor;
  /* default constructor */
  public Guitar(){
    numStrings = 6;
    guitarLength = 28.2;
    guitarManufacturer = "Gibson";
    guitarColor = "Red";
  }// end default constructor

  /* constructor */
  public Guitar(int givenStrings, double givenLength, String givenManufacturer, String givenColor){
    numStrings = givenStrings;
    guitarLength = givenLength;
    guitarManufacturer = givenManufacturer;
    guitarColor = givenColor;
  }// end constructor

  public void setNumStrings(int newValue){
    numStrings = newValue;
  }
  public void setGuitarLength(double newValue){
    guitarLength = newValue;
  }
  public void setGuitarManufacturer(String newValue){
    guitarManufacturer = newValue;
  }
  public void setGuitarColor(String newValue){
    guitarColor = newValue;
  }
  public int getNumStrings(){
    return numStrings;
  }
  public double getGuitarLength(){
    return guitarLength;
  }
  public String getGuitarManufacturer(){
    return guitarManufacturer;
  }
  public String getGuitarColor(){
    return guitarColor;
  }
//  public playGuitar(){
//    String play = "[";
//    //arrays containing possible notes and duration
//    char[] notes = {'A','B','C','D','E','F','G'};
//    double[] duration = {0.25,0.5,1,2,4};
    //integers works as index for the arrays above
//    int a;
//    int b;
    //initiate a random number
//    Random rn = new Random();
    //for loop to select 16 randomly selected musical notes of random duration
//    for (int k=0;k<16;k++) {
//    a = rn.nextInt(7);
//    b = rn.nextInt(5);
//    play = play + notes[a] + "(" + String.valueOf(duration[b]) + ")";
//    if (k!=15) play = play + ",";
//    }
//    play = play + ']';
//    System.out.println(play);
//    }
  public static void main(String[] args){
  Guitar guitar1 = new Guitar(6,40.6,"Eastman","Blue");
  System.out.println("This guitar has " + guitar1.getNumStrings()+ " strings");
  System.out.println("The guitar length is " + guitar1.getGuitarLength());
  System.out.println("This guitar is " + guitar1.getGuitarColor()+ " and made by " + guitar1.getGuitarManufacturer());
  }
}//end class
