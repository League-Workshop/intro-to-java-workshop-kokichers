package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {

Robot k1b0 = new Robot();
k1b0.penDown();
k1b0.setSpeed(1000000000);
for (int i = 0; i < 360; i++) {
	k1b0.move(1);
	k1b0.turn(360/360);
}
k1b0.sparkle();
    }
}
