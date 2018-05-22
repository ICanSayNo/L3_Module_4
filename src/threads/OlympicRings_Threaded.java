package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(400, 600);
		Robot yellow = new Robot(600, 750);
		Robot black = new Robot(800, 600);
		Robot green = new Robot(1000, 750);
		Robot red = new Robot(1200, 600);

		blue.setSpeed(100);
		yellow.setSpeed(100);
		black.setSpeed(100);
		green.setSpeed(100);
		red.setSpeed(100);
		
		blue.setPenWidth(100);
		yellow.setPenWidth(100);
		black.setPenWidth(100);
		green.setPenWidth(100);
		red.setPenWidth(100);
		
		blue.penDown();
		yellow.penDown();
		black.penDown();
		green.penDown();
		red.penDown();

		blue.setPenColor(Color.BLUE);
		yellow.setPenColor(Color.yellow);
		black.setPenColor(Color.BLACK);
		green.setPenColor(Color.GREEN);
		red.setPenColor(Color.RED);
		
		Thread r1 = new Thread(()->goInABigCircleThatIsColoredInaSpecificColorSpecificToARobotsName(blue));
		Thread r2 = new Thread(()->goInABigCircleThatIsColoredInaSpecificColorSpecificToARobotsName(yellow));
		Thread r3 = new Thread(()->goInABigCircleThatIsColoredInaSpecificColorSpecificToARobotsName(black));
		Thread r4 = new Thread(()->goInABigCircleThatIsColoredInaSpecificColorSpecificToARobotsName(green));
		Thread r5 = new Thread(()->goInABigCircleThatIsColoredInaSpecificColorSpecificToARobotsName(red));
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
	}
		public static void goInABigCircleThatIsColoredInaSpecificColorSpecificToARobotsName(Robot robotThatIshavingThisMethodCalledUponit) {
			robotThatIshavingThisMethodCalledUponit.setAngle(270);
			for (int i = 0; i < 360; i++) {
				robotThatIshavingThisMethodCalledUponit.move(30);
				robotThatIshavingThisMethodCalledUponit.turn(10);
			}
		}
}
