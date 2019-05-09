import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class robot_class {
	public static void main(String[] args) {
			//String shape = JOptionPane.showInputDialog("which chape do you want?");
		
	while(true) {
	
		String shape = JOptionPane.showInputDialog("which chape do you want?");

	if(shape.equals("square")) {
		drawSquare();
		break;
	}
	
	else if(shape.equals("circle")) {
		drawCircle();
		break;
	}
	
	else if(shape.equals("traingle")) {
		drawTraingle();
		break;
	}
	
	else {
		JOptionPane.showMessageDialog(null,"pick different shape");
	}
	}		
		//drawSquare();
		//drawTraingle();
		//drawCircle();
		
			
		
	}
static void drawSquare(){
	Robot jama = new Robot();
	for(int i=0; i<4;i++) {
		jama.setSpeed(45);
		jama.penDown();
		jama.move(200);
		jama.turn(360/4);
	}
}
static void drawTraingle() {
	Robot jama = new Robot();
	jama.setAngle(30);
	for(int i=0; i<3;i++) { 		
		jama.setSpeed(45);
		jama.penDown();
		jama.move(200);
		jama.turn(360/3);
}
}
static void drawCircle() {
	Robot jama = new Robot();
	jama.setAngle(30);
	for(int i=0; i<360;i++) { 		
		jama.setSpeed(45);
		jama.penDown();
		jama.move(5);
		jama.turn(360/360);
}
}
}
