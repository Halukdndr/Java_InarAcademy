package chapters.chapter_03.examples;

import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weigth  in pound and height in inch: ");
		
		double weigth = input.nextDouble();
		double heigth = input.nextDouble();
		
		weigth *= 0.45359237; 
		heigth *= 0.0254;
		
		double BMI = weigth / (Math.pow(heigth, 2));
		
		System.out.println("BMI is " + BMI);
		
		if (BMI < 18.5) {
			System.out.println("Underweigth");
		}else if (18.5 <= BMI && BMI < 25.0) {
			System.out.println("Normal");
		}else if (25.0 <= BMI && BMI < 30.0) {
			System.out.println("Overweigth");
		}else  
			System.out.println("Obese");
		}
		
	}


