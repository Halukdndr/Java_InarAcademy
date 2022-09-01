package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
		double tempOut = input.nextDouble();
		
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		if (tempOut < -58 || tempOut > 41 || windSpeed < 2 ) {
			System.out.println("Whether the temperature and/or wind speed is invalid.");
			System.exit(1);
		}
		
		double tempWindChill = 35.74 + 0.6215 * tempOut - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * tempOut * Math.pow(windSpeed, 0.16);
		System.out.println("The wind-chill index is " + tempWindChill);
	}

}
