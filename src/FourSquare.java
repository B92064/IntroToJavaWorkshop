import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot A = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
A.setSpeed(10);
A.penDown();
		// 5. Set the pen width to 5
A.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...

for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
	A.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
A.turn(90);
}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		for (int i = 0; i < 4; i++) {
			A.move(100);
			A.turn(90);
		}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



