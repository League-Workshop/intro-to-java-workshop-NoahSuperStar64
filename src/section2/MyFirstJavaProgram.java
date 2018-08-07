package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	System.out.println("Hello world");
	
	Robot MAP = new Robot();
	
	MAP.miniaturize();
	MAP.setSpeed(500);
	MAP.sparkle();
	MAP.penDown();
	MAP.setAngle(45);
	
	for (int i = 0; i < 4; i++) {MAP.setRandomPenColor();
		MAP.turn(90);
	MAP.move(100);
	}
		
	}
}
