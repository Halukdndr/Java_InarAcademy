package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a , b , c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double x = (Math.pow(b, 2) - 4.0 * a * c);
		double x1 = (Math.pow(x, 0.5) - b) / (2 * a);
		double x2 = -1 * (Math.pow(x, 0.5) + b) / (2 * a);

		if (x > 0)
			System.out.println("The equation has two roots " + x1 + " and " + x2);
		if (x == 0)
			System.out.println("The equation has one root " + x1);
		if (x < 0)
			System.out.println("The equation has no real roots");
	}
}