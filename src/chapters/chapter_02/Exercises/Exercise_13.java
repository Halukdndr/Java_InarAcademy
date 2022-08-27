package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		// Financial application: compound value

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the monthly saving amount: ");
		double amount = input.nextDouble();
		double mounthlyIntrestRate = 0.00417;

		double sum = amount + amount * mounthlyIntrestRate;
		sum += amount + (sum + amount) * mounthlyIntrestRate;
		sum += amount + (sum + amount) * mounthlyIntrestRate;
		sum += amount + (sum + amount) * mounthlyIntrestRate;
		sum += amount + (sum + amount) * mounthlyIntrestRate;
		sum += amount + (sum + amount) * mounthlyIntrestRate;

		System.out.println("After the sixth month, the account value is $" + (int) (sum * 100) / 100.0);

	}

}
