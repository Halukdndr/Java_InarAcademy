package chapters.chapter_02.exercises;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		// Science: calculating energy

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount of water in kilograms: ");
		double amount = input.nextDouble();

		System.out.println("Enter the initial temperature: ");
		double initialTemp = input.nextDouble();

		System.out.println("Enter the final temperature: ");
		double finalTemp = input.nextDouble();

		double energy = amount * (finalTemp - initialTemp) * 4184;

		System.out.println("The energy needed is " + energy);
	}

}
