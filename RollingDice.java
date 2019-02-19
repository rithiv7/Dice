public class RollingDice {
    public static void main (String [] args) {
        Dice dice1 = new Dice(); 
        Dice dice2 = new Dice();
        Dice dice3 = new Dice(); 
        
        ////System.out.println (dice1.getFaceValue());
        
        // Roll Dice 1
        
        dice1.roll();
        System.out.println ("Dice 1 first roll : " + dice1);
        dice1.roll();
        System.out.println ("Dice 1 second roll : " + dice1);
        
        //Roll Dice 2
        
        dice2.roll();
        System.out.println ("Dice 2 first roll : " + dice2);
        dice2.roll();
        System.out.println ("Dice 2 second roll : "+ dice2);
        
        //Roll Dice 3
        
        dice3.roll();
        System.out.println ("Dice 3 first roll : " + dice3);
        dice3.roll();
        System.out.println ("Dice 3 second roll : " + dice3);
         
        //Change Dice 2 face value 
        
        dice2.setFaceValue(5); 
        System.out.println("For Dice 2, the " + dice2);
        
        
    }
}
