package section2;

import org.jointheleague.graphical.robot.Robot;
public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		
		int flameSize = 200;		

Robot k1b0 = new Robot();
k1b0.penDown();
k1b0.setPenColor(00, 00, 00);
k1b0.setPenWidth(75);
k1b0.sparkle();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen

k1b0.setSpeed(100);
for (int i = 0; i < 25; i++) {
k1b0.turn(360/8);
k1b0.move(64);
k1b0.turn(-40);
k1b0.move(200);
k1b0.turn(-190);
k1b0.move(200);
k1b0.turn(64);
k1b0.move(300);
	// 11. Color your ninja star like Figure 2.	

}
	}
}


