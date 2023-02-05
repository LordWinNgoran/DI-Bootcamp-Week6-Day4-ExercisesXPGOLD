//Exercise 3 : Charge
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a static method charge that causes the robot to drive forwards until it 
* has gone either maxDist squares or until it hits a wall, whichever is sooner.
* You may call the method blocked() on the robot; blocked() returns true if there is a 
* wall in front of the robot, and false otherwise.
* date: 03/02/2023
*/

package exercise3;

public class ChargingRobotDemo {
	
	public static void charge(SimpleRobot r, int maxDist) {
	    // you write this part
	  }

	  public static void main(String args[]) {
	    SimpleRobot r = new SimpleRobot();
	    r.forward();
	    r.right();
	    charge(r, 3);
	  }

}
