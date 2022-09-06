package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int n = input.nextInt();
		
		System.out.println("Enter the length of one side: ");
		double s = input.nextDouble();
		
		double area = n * s * s / (4 * Math.tan(Math.PI / n));
		
		System.out.println("The area of the polygon is ");
		System.out.printf("%5.2f", area);
		
		
		
	}

}
