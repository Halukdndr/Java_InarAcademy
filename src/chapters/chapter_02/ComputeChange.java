package chapters.chapter_02;

import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		// We need a scanner for learn how much money does the user have then create a
		// promt

		Scanner input = new Scanner(System.in);

		System.out.println(" How much money you have: ");

		double amount = input.nextDouble();
		int totalCents = (int) (amount * 100);

		int dollars = totalCents / 100;

		int remainingCents = totalCents % 100;

		int quarters = remainingCents / 25;

		remainingCents = remainingCents % 25;

		int dimes = remainingCents / 10;

		remainingCents %= 10;

		int nickels = remainingCents / 5;

		remainingCents %= 5;

		int pennies = remainingCents;

		System.out.println("Your money " + amount + "consist of : ");
		System.out.println(dollars + " dollars ");
		System.out.println(quarters + " quarters ");
		System.out.println(dimes + " dimes ");
		System.out.println(nickels + " nickels ");
		System.out.println(pennies + " pennies ");

	}

}
