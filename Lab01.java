/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01 {

     public static void main(String[] args) {
          // TODO Your code goes here
    	 Display.openWorld("maps/school.map");
    	 Display.setSize(10, 10);
    	 
    	 Robot lisa = new Robot();
    	 Robot pete = new Robot(4, 5, Display.SOUTH, 0);
    	 
    	 lisa.move();
    	 lisa.move();
    	 lisa.turnLeft();
    	 lisa.move();
    	 lisa.turnLeft();
    	 lisa.move();
    	 lisa.pickBeeper();
    	 lisa.turnLeft();
    	 lisa.turnLeft();
    	 lisa.move();
    	 lisa.turnLeft();
    	 lisa.turnLeft();
    	 lisa.turnLeft();
    	 lisa.move();
    	 lisa.turnLeft();
    	 lisa.move();
    	 lisa.move();
    	 lisa.move();
    	 lisa.turnLeft();
    	 lisa.move();
    	 lisa.move();
    	 lisa.move();
    	 lisa.turnLeft();
    	 lisa.move();
    	 lisa.move();
    	 lisa.turnLeft();
    	 lisa.turnLeft();
    	 lisa.turnLeft();
    	 lisa.move();
    	 lisa.putBeeper();
    	 pete.pickBeeper();
    	 pete.move();
    	 pete.turnLeft();
    	 pete.move();
    	 pete.move();
    	 pete.turnLeft();
    	 pete.move();
    	 pete.move();
    	 pete.turnLeft();
    	 pete.turnLeft();
    	 pete.turnLeft();
    	 pete.move();
    	 pete.move();
    	 pete.turnLeft();
    	 pete.move();
    	 pete.turnLeft();
    	 pete.move();
    	 pete.move();
    	 pete.turnLeft();
    	 pete.turnLeft();
    	 pete.turnLeft();
    	 pete.move();
    	 pete.move();
    	 pete.turnLeft();
    	 pete.move();
    	 pete.move();
    	 pete.putBeeper();
    	 pete.turnLeft();
    	 pete.turnLeft();
    	 pete.move();
   
    	 
    	 
    	 
    	 
    	 
     }
}
