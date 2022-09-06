package chapters.chapter_04.examples;

import java.util.Scanner;

public class LotteryUsingStrings {

	public static void main(String[] args) {
		
		String lottery = "" + (int)(Math.random() * 10) + "" + (int)(Math.random() * 10);		
		
		char l1 = lottery.charAt(0);
		char l2 = lottery.charAt(1);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two digits: ");
		String guess = input.next();
		
		if (guess.length() != 2) {
			System.err.println("The input is invalid!");
			System.exit(0);
		}
		
		char g1 = guess.charAt(0);
		char g2 = guess.charAt(1);
		
		if (l1 == g1 && l2 == g2) {
			System.out.println("The lucky number is " + l1 + "" + l2 + "\n");
			System.out.println("Exact match: you win $10,000" );
		}else if (l1 == g2 && l2 == g1) {
			System.out.println("The lucky number is " + l1 + "" + l2 + "\n");
			System.out.println("Match all digits: you win $3,000" );
		}else if (l1 == g1 || l2 == g2 || l1 == g2 || l2 == g1) {
			System.out.println("The lucky number is " + l1 + "" + l2 + "\n");
			System.out.println("Match one digit: you win $1,000");
		}else { System.out.println("The lucky number is " + l1 + "" + l2 + "\n");
				System.out.println("Sorry: no match");}
		
		
	}

}
