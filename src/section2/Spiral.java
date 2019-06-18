package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot k1b0 = new Robot();
		k1b0.sparkle();
		Robot.setWindowColor(255,255,255);
		k1b0.penDown();
		k1b0.setSpeed(100000000);
		for (int i = 0; i < 360; i++) {
		k1b0.setPenColor(00,00,00);
		k1b0.move(2*i);
		k1b0.turn(360/7);
		k1b0.setPenWidth(2*i);
		}	
	}
}
            