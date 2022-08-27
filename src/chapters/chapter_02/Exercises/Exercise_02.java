package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		//Compute the volume of cylinder
	
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
		
		System.out.println("Enter a value for radius of the cylinder: ");
		
		double radius = input.nextDouble();
		
		System.out.println("Enter a value for length of the cylinder: ");
		
		double length = input.nextDouble();
		
		double theVolume = Math.pow(radius, 2) * PI * length;
		
		double theArea = 2 * Math.pow(radius, 2) + (2 * PI * radius * length);
		
		System.out.println("The volume of the cylinder is " + theVolume);
		System.out.println("The area of the cylinder is " + theArea );
	}

}
