package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of the money that you put: ");
		double amount = input.nextDouble();
		System.out.println("Enter annual percentage yield (e.g., 5.75)");
		double annualPercentageYield = input.nextDouble();
		double monthlyPercentageYield = annualPercentageYield / 1200;
		System.out.println("Enter the number of months: ");
		int month = input.nextInt();
		
		System.out.println("Month  CD Value");
		
		double totalMoney = amount;
		for (int i = 1; i <= month; i++) {
			totalMoney += totalMoney * monthlyPercentageYield;
	
			System.out.printf("%-2d %12.2f\n", i, totalMoney );
		}
		

	}

}
