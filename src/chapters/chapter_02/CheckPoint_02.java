package chapters.chapter_02;

import java.util.Scanner;

public class CheckPoint_02 {

	public static void main(String[] args) {
		final double PI = 3.14159;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a number for radius: ");
			
			double radius = input.nextDouble();
			
			double area = radius * radius * PI ;
			
			System.out.println("The area for a circle of radius " + radius + " is " + area );
		}

	}

}


