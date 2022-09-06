package chapters.chapter_02.exercises;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		// Sum the digits in an integer

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 1000 :");

		int number = input.nextInt();

		int a = number / 100;

		int x = number % 100;

		int b = x / 10;

		int y = x % 10;

		int c = y / 1;
		System.out.println("The sum of the digits is " + (a + b + c));
	}

}
