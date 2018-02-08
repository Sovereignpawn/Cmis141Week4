/*  File:       Mowers.java
 *  Author:     Matthew Dwyer
 *  Date:       1 Feb 2018
 *  Purpose:    Demonstrate understanding of classes and objects
 */

/**
 *  The following class will create two instances of an object called Mowers. The
 *  mowers have two states (fields) their price and whether they are self propelled or not.
 *  These fields can be changed by invoking one of two methods setPrice or setPropulsion.
 *  Finally a statement will be printed identifying the final value of the two fields
 *  for each instance.
 */
public class Mowers {
  /*variable declaration (fields)*/
  private boolean selfPropel;
  private int mowerPrice;
  /*constructor which applies an initial value for the two fields*/
  public Mowers(){
    selfPropel = false;
    mowerPrice = 0;
  }//end constructor

  public boolean getSelfPropel(){//return the value of the variable 'selfPropel' from the setSelfPropel method
    return selfPropel;
  }//end getSelfPopel method

  public int getMowerPrice(){//return the value of the variable 'mowerPrice' from the setMowerPrice method
    return mowerPrice;
  }//end getMowerPrice method

  public void setPropulsion(boolean newValue){// the value passed to this method is set as a boolean data type and stored as the variable 'newValue'
    selfPropel = newValue;//the selfPropel variable is changed to the value held in the 'newValue' variable
  }//end set propulsion method

  public void setPrice(int newValue){// the value passed to this method is set as a int data type and stored as the variable 'newValue'
    mowerPrice = newValue;//the mowerPrice variable is changed to the value held in the 'newValue' variable
  }//end set price method

  public static void main(String[] args){
    Mowers mower1 =new Mowers();// This statement and the next call the constructor
    Mowers mower2 =new Mowers();
    mower1.setPropulsion(true);// call setPropulsion method and pass the value of 'false' to it
    mower1.setPrice(78);//call setPrice method and pass the value of '78' to it.
    mower2.setPropulsion(false);//do the same as with mower1 instance but with different values
    mower2.setPrice(120);
    /*
    *  Finally print a statement to the user notifying them of the values set above.
    *  The values are returned by calling the getMowerPrice and getSelfPropel methods
    */
    System.out.println("Mower 1 has a sale price of $" + mower1.getMowerPrice() + " it is " + mower1.getSelfPropel() + " that it is self Propelled");
    System.out.println("Mower 1 has a sale price of $" + mower2.getMowerPrice() + " it is " + mower2.getSelfPropel() + " that it is self Propelled");
  }//end main method
}//end class
