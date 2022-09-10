package chapters.chapter_05.examples;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int data;
		do {
			System.out.println("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
			sum += data;
			System.out.println("The sum is " + sum);
		}while (data != 0);

		System.out.println("The final sum is " + sum);
	}

}
