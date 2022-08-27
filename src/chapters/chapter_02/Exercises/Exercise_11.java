package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		// Population projection
		
		int currentPopulation = 312032486;
		int annualBirth = 365 * 24 * 60 * 60 / 7;
		int annualDeath = 365 * 24 * 60 * 60 / 13;
		int annualImmigrant = 365 * 24 * 60 * 60 / 45;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of years after now: ");
		int x = input.nextInt();
		
		currentPopulation += x * (annualBirth - annualDeath + annualImmigrant);
		
		System.out.println("The population in 5 years is " + currentPopulation);
		
		
		
		
		
		

	}

}
