package section2;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class PentagonCrazy {

	private void makePrettyThings() {
		Robot.setWindowColor(255,255,255);
Robot k1b0 = new Robot();
k1b0.penDown();
k1b0.setSpeed(100);
k1b0.setPenColor(00,00,00);
int sides = 5;
int angle = 360/5;
for (int i = 0; i < 200; i++) {
	k1b0.move(i);
	k1b0.turn(angle + 1);
}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
