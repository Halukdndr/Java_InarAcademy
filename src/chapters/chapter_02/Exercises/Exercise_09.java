package chapters.chapter_02.exercises;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		// Acceleration
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter vStart, vFinal and time span: ");
		
		double vStart = input.nextDouble();
		double vFinal = input.nextDouble();
		double time = input.nextDouble();
		double acceleration;
		
		acceleration = (vFinal - vStart) / time;
		
		System.out.println("The average acceleration is " + (int)(acceleration * 10000) / 10000.0);
		
	}

}
