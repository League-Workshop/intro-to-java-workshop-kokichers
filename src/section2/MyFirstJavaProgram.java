package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot k1b0 = new Robot();
		k1b0.setRandomPenColor();
		k1b0.setSpeed(100);
		k1b0.penDown();
		for(int i=0;i<4;i)
		k1b0.move(100);
		k1b0.turn(90);
	
		k1b0.sparkle();
}
}