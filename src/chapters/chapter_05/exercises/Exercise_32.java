package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_32 {

	public static void main(String[] args) {

		int l1 = (int)(Math.random() * 9 + 1);
		int l2 = (int)(Math.random() * 10);
		while (l1 == l2) {
			l2 = (int)(Math.random() * 10);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Try to find the lucky number (10 to 98)");
		
		int guessNum = input.nextInt();
		int g1 = guessNum / 10;
		int g2 = guessNum % 10;
		
		if (l1 == g1 && l2 == g2) {
			System.out.println("Congrats!You won 10000$");
		}else if (l1 == g2 && l2 == g1) {
			System.out.println("You won 3000$");
		}else if (l1 == g1 || l2 == g2 || l2 == g1 || l1 == g2) {
			System.out.println("You won 1000$");
		}else System.out.println("We are sorry!Please try again");

		
		System.out.println(l1 + "" + l2);
	}

}
