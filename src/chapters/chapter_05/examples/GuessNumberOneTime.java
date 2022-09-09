package chapters.chapter_05.examples;

import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {

		int number = (int) (Math.random() * 101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the number");
		
		int guess = input.nextInt();
		while (guess != number) {
			if (guess > number) {
				System.out.println("Your guess is high ");
				guess = input.nextInt();
			}else { System.out.println("Your guess is low");
			guess = input.nextInt();
			}
		}
		System.out.println("You found it!");
		
		

	}

}
