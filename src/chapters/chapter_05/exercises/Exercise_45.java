package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double data;
		double mean , deviation;
		double sum = 0;
		double sumSquare = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a number:");
			data = input.nextDouble();
			sum += data;
			sumSquare += Math.pow(data, 2);
			}

		mean = sum / 10;
		deviation = Math.sqrt((sumSquare - Math.pow(sum, 2) / 10) / (9));
		
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + deviation);
		
		
	}

}
