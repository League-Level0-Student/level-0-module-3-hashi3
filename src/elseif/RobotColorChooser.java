//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		
	
		
		//3. Ask the user what color they would like the robot to draw
		
		
		//5. Use an if/else statement to set the pen color that the user requested
		Robot jama1 = new Robot();

		for (int i = 0; i < 100; i++) {
			
			String input1 = JOptionPane.showInputDialog("what is your favorite color");
			
			
			
		
		  if(input1. equals("red")) {
			  
			 jama1.setPenColor(Color.red);
			 
		  }
		  
		  else if(input1.equals("blue")) {
			  jama1.setPenColor(Color.BLUE);
		  }
		  
		  else { 
			  
			  jama1.setRandomPenColor();

		  }
		  
		  jama1.setPenWidth(10);
			 jama1.penDown();
			 jama1.setSpeed(45);
	          for (int i1 = 0; i1 < 4; i1++) {
				jama1.move(100);
				jama1.turn(360/4);
		}		  
        //6. If the user doesn’t enter anything, choose a random color
		  

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		 

	}
	}
	
}
