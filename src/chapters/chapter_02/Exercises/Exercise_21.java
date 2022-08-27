package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise_21 {
	
	public static void main(String[] args) {
		// Financial application: calculate future investment value
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double futureInvestmentValue = investmentAmount * (Math.pow(1 + monthlyInterestRate, years * 12));
	
		System.out.println("Accumulated value is $" + futureInvestmentValue);
	
	}

}
