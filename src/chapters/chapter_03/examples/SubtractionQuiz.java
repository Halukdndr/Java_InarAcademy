package chapters.chapter_03.examples;

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + number1 + " - " + number2 + " ?");
		
		int score = input.nextInt();
		
		
			System.out.println(number1 + " - " + number2 + " = " + score + " is " + (score == number1 - number2));
		
		
	}

}
