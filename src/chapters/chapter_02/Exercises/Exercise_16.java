package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {
		// Geometry: area of a hexagon
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		double area = ((3 * Math.pow(3,0.5)) / 2.0 ) * Math.pow(side, 2);
		
		System.out.println("The area of hexagon is " + area);

	}

}
