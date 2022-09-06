package chapters.chapter_04.exercises;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		// Corner point coordinates
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the bounding circle:");

		double r = input.nextDouble();
		
		double x1 = Math.cos(Math.toRadians(18)) * r;
		double y1 = Math.sin(Math.toRadians(18)) * r;
		double x2 = 0;
		double y2 = r;
		double x3 = -1 * Math.cos(Math.toRadians(18)) * r;
		double y3 = Math.sin(Math.toRadians(18)) * r;
		double x4 = -1 * Math.sin(Math.toRadians(36)) * r;
		double y4 = -1 * Math.cos(Math.toRadians(36)) * r;
		double x5 = Math.sin(Math.toRadians(36)) * r;
		double y5 = -1 * Math.cos(Math.toRadians(36)) * r;		
			
		System.out.println("The coordinates of five points on the pentagon are ");
		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3 + " " + x4 + " " + y4 + " " + x5 + " " + y5); 		
	}

}
