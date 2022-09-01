package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		
		// Declare the edges of the second rectangle
		// A(Ax,Ay) = (x2 - w2 / 2),(y2 - h2 / 2)
		
		double aX = x2 - w2 / 2.0;
		double aY = y2 + h2 / 2.0;
		double bX = x2 + w2 / 2.0;
		double bY = y2 + h2 / 2.0;
		double cX = x2 - w2 / 2.0;
		double cY = y2 - h2 / 2.0;
		double dX = x2 + w2 / 2.0;
		double dY = y2 - h2 / 2.0;
		
		// Check the locations of rectangles according to the distance between 
		//the edges of 2.rectangle and the center of first rectangle  
		
		if (Math.abs(x1 - aX) <= (w1 / 2.0) && Math.abs(y1 - aY) <= (h1 / 2.0) && Math.abs(x1 - bX) <= (w1 / 2.0) && Math.abs(y1 - bY) <= (h1 / 2.0) &&
			Math.abs(x1 - cX) <= (w1 / 2.0) && Math.abs(y1 - cY) <= (h1 / 2.0) && Math.abs(x1 - dX) <= (w1 / 2.0) && Math.abs(y1 - dY) <= (h1 / 2.0)) {
			System.out.println("r2 is inside r1");
			}else if (Math.abs(x1 - aX) <= w1 / 2 && Math.abs(y1 - aY) <= h1 / 2 || Math.abs(x1 - bX) <= w1 / 2 && Math.abs(y1 - bY) <= h1 / 2 ||
					  Math.abs(x1 - cX) <= w1 / 2 && Math.abs(y1 - cY) <= h1 / 2 || Math.abs(x1 - dX) <= w1 / 2 && Math.abs(y1 - dY) <= h1 / 2) {
				System.out.println("r2 overlaps r1");
			}else if (Math.abs(x1 - x2) <= w2 - w1/ 2 && Math.abs(y1 - y2) <= h2 - h1/ 2) {
				System.out.println("r1 is inside r2");
			}else System.out.println("r2 does not overlap r1");
		
		
		
		
	}

}
