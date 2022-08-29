package chapters.chapter_03.examples;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		int luckyNumber = (int)(Math.random() * 90 + 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a two digit number to win the lottery: ");
		int guess = input.nextInt();

		int g1 = guess / 10;
		int g2 = guess % 10;
		
		int l1 = luckyNumber / 10;
		int l2 = luckyNumber % 10;
		
		if (guess == luckyNumber) {
			System.out.println("You won 10000$ !");
		}else if (g1 == l2 && g2 == l1) {
			System.out.println("You won 30000$ !");
		}else if (g1 == l1 || g1 == l2 || g2 == l1 || g2 == l2) {
			System.out.println("You won 1000$ !");
		}else System.out.println("Unfurtunitely!");
	}

}
