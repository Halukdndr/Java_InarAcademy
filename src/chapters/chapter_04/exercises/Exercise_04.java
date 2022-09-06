package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side o a hexagon: ");
		
		double s = input.nextDouble();
		
		double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));
		
		System.out.println("The area of the hexagon is " );
		System.out.printf("%3.2f", area);
		
		
		
		
	}

}
