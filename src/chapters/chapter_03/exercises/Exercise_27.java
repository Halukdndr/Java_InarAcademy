package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x- and y-coordinates:");
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x0 = 200;
		double y0 = 0;
		double x1 = 0;
		double y1 = 100;
		
		if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) >= 0 && x2 >= 0 && y2 >= 0) {
			System.out.println("The point is in the triangle");
		}else System.out.println("The point is not in the triangle");
		
		
		

	}

}
