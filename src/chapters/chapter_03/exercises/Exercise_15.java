package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		int lottery = (int) (Math.random() * 900 + 100);
		int l3 = lottery % 10;
		int l2 = (lottery % 100) / 10;
		int l1 = lottery / 100;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit number and try your chance: ");

		int guess = input.nextInt();
		int g3 = guess % 10;
		int g2 = (guess % 100) / 10; 
		int g1 = guess / 100;
		
		if (lottery == guess) {
			System.out.println("Congratulations!You won 10000$");
		}else if ((l1 == g1 || l1 == g2 || l1 == g3) && (l2 == g1 || l2 == g2 || l2 == g3) && (l3 == g1 || l3 == g2 || l3 == g3) && (l1 + l2 + l3 == g1 + g2 + g3)) {
			System.out.println("Congrats!You won 3000$");
		}else if (l1 == g1 || l1 == g2 || l1 == g3 || l2 == g1 || l2 == g2 || l2 == g3 || l3 == g1 || l3 == g2 || l3 == g3) {
			System.out.println("Good luck!You won 1000$");
		}else System.out.println("Please try again");

	}

}
