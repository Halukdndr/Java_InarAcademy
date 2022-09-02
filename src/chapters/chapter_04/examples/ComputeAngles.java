package chapters.chapter_04.examples;

import java.util.Scanner;

public class ComputeAngles {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double a = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double b = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
		double c = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		
		double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double angleC = Math.toDegrees(Math.acos((c * c - a * a - b * b) / (-2 * b * a)));
		
		System.out.println("The three angles are " + Math.round(angleA * 100) / 100.0 + " " + Math.round(angleB * 100) / 100.0 + " " + Math.round(angleC * 100) / 100.0);
		
	}

}
