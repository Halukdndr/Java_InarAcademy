package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		// Financial application: monetary units
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer whose last two digits franction (e.g., 11.56): ");
		int amount = input.nextInt();
		
		int dollars = amount / 100;
		int remainingCents = amount % 100;
		int quarters = remainingCents / 25;
		remainingCents %= 25;
		int dimes = remainingCents / 10;
		remainingCents %= 10;
		int nickels = remainingCents / 5;
		remainingCents %= 5;
		int pennies = remainingCents;
		 System.out.println("Your money consists of ");
		 System.out.println(dollars + " dollars");
		 System.out.println(quarters + " quarters");
		 System.out.println(dimes + " dimes");
		 System.out.println(nickels + " nickels");
		 System.out.println(pennies + " pennies");
	}

}
