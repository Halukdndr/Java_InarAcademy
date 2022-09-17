package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_42 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter commission_sought:");
		double commissionSought = input.nextDouble();
		double baseSalary = 5_000;
		double salesAmount = 0;
		double commission = 0;
		commissionSought -= baseSalary;
		for (salesAmount = 0; commission < commissionSought ; salesAmount++ ) {
			if (salesAmount > 10_000) {
				commission = (salesAmount - 10_000) * 0.12 + 5_000 * 0.10 + 5_000 * 0.08;
			}else if (salesAmount > 5_000) {
				commission = (salesAmount - 5_000) * 0.10 + 5_000 * 0.08;
			}else if (salesAmount > 0) {
				commission = salesAmount * 0.08;
			}
		}
		System.out.println("You have to sell " + (salesAmount - 1) + "$ worth item");
		
	}

}
