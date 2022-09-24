package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enterloan amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		System.out.println("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = (amount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, years * 12)));
		double totalPayment = monthlyPayment * years * 12;
		
		System.out.printf("\nMonthly Payment: %3.2f" , monthlyPayment);
		System.out.printf("\nTotal Payment: %7.2f" , totalPayment);
		System.out.println("\n\nPayment#	Interest	Principal	Balance");
		
		double intrest = 0;
		double principal = 0;
		double balance = amount;
		
		for (int i = 1; i <= years * 12; i++) {
			intrest = monthlyInterestRate * balance;
			principal = monthlyPayment - intrest;
			balance = balance - principal;
			System.out.printf("%-2d\t\t", i);
			System.out.printf("%3.2f\t\t", intrest);
			System.out.printf("%3.2f\t\t", principal);
			System.out.printf("%7.2f", balance);
			System.out.println();
		}

	}

}
