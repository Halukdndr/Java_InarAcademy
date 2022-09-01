package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		
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
		
		System.out.println("You have ");
		if (dollars > 1) {
			System.out.println(dollars + " dollars ");
		}else if (dollars == 1) {
			System.out.println(dollars + " dollar ");
		}
		if (quarters > 1) {
			System.out.println("and " + quarters + " quarters ");		
		}else if (quarters == 1) {
			System.out.println("and " + quarters + " quarter ");
		}
		if (dimes > 1) {
			System.out.println("and " + dimes + " dimes ");
		}else if (dimes == 1) {
			System.out.println("and " + dimes + " dime ");
		}
		if (nickels > 1) {
			System.out.println("and " + nickels + " nickels");
		}else if (nickels == 1) {
			System.out.println("and " + nickels + " nickel");
		}
		if (pennies > 1) {
			System.out.println("and " + pennies + " pennies");
		}else if (pennies == 1) {
			System.out.println("and " + pennies + " penny");
		}
	}
	

}
