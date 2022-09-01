package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, and p2:");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		if ((x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) == 0) {
			if((y1 > y2 && y2 > y0 || y1 < y2 && y2 < y0) && (x1 > x2 && x2 > x0 || x1 < x2 && x2 < x0)) {
			System.out.println("The point is on the line segment");
		}else System.out.println("The point is not on the line segment");
		
	}else System.out.println("The point is not on the line");
	}
}
