package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		System.out.println("Enter feet: ");
		System.out.println("Enter inches: ");
		
		double weight = input.nextInt();
		int feet = input.nextInt();
		int inches = input.nextInt();
		double height;
		
		weight *= 0.45359237; 
		inches += (feet * 12);
		height = inches * 0.0254;
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI: " + bmi);
		
		if (bmi < 18.5 ) {
			System.out.println("Underweight");
		}else if (bmi < 25.0) {
			System.out.println("Normal");
		}else if (bmi < 30.0) {
			System.out.println("Overweight");
		}else System.out.println("Obese");
		
	}
}
