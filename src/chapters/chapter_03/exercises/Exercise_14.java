package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		int coin = (int) (Math.random() + 0.5);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess heads or tails (enter 0 for heads, 1 for tails): ");
		
		int guess = input.nextInt();
		
		if (guess == coin) {
			System.out.println("Congrats!");
		}else if (coin == 0) {
			System.out.println("Sorry it's not tails");
		}else System.out.println("Sorry it' not heads");
		
		
		
	}

}
