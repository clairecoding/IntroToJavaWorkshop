package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE 
		Robot r2d2=new Robot();
	r2d2.setPenColor(Color.green);
r2d2.penDown();
for (int i = 0; i < 8; i++) {
	int number=45;
r2d2.move(90);
r2d2.turn(number);
}
}
}