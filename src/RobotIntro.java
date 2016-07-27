import org.jointheleague.graphical.robot.Robot;

public class RobotIntro {
	public static void main(String[] args) {
		Robot Brandon = new Robot(500, 500);
		Brandon.penDown();
		Brandon.setSpeed(10);
		int Square = 0;
		while(Square<4){
			Brandon.move(400);
			Brandon.turn(90);
			Square= Square + 1;
			
		}
		int Hexagon = 0;
		while(Hexagon<8){
			Brandon.turn(45);
			Brandon.move(100);
			Hexagon = Hexagon + 1;
		}
		int o = 200;
		int Circle = 0;
		while(Circle<150){
			Brandon.setRandomPenColor();
			Brandon.turn(92);
			Brandon.move(0);
			Circle = Circle + 1;
			o = o + 100;
		}
		Brandon.move(400);
		}
}
