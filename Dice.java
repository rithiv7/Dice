// *************************************************************
// Dice.java                Author: Rithi
// 
// Represents one die with faces showing values between 1 and 6.
// *************************************************************

import java.util.Random;

public class Dice
{
    Random rand = new Random();
    private final int MAX = 6; // max face value
    public int faceValue; // current value on die
   
    // ---------------------------------------------------
    // Constructor: Sets the initial face value.
    // ---------------------------------------------------
    public Dice ()
    {
      faceValue = 1;   
    } 
   
    // --------------------------------------------------
    // Rolls the die and returns the result.
    // --------------------------------------------------
    
    public int roll()
    { 
        faceValue = rand.nextInt(6)+1; 
        return faceValue;
    }
     
    // -------------------------------------------------
    // Face value mutator. 
    // -------------------------------------------------
    
    public void setFaceValue (int value) // value is your formal parameter
    {
        faceValue = value; 
    }
    
    // -------------------------------------------------
    // Face value accessor. 
    // -------------------------------------------------
    public int getFaceValue()
    {
        return faceValue; 
    }
    
    // -------------------------------------------------
    // Returns a string representation of this die. 
    // -------------------------------------------------
    public String toString()
    {
        String result = "the face value is " + faceValue;
        
        return result; 
    }
}
