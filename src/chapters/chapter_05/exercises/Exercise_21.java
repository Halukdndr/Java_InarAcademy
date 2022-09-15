package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		System.out.println("Enter number of years: ");
		int years = input.nextInt();

		System.out.println("Interest Rate    Monthly Payment       Total Payment");

		double annualInterestRate = 4.875;
	

		for (int i = 0; i < 25; i++) {
			annualInterestRate += 0.125;
			double montlyInterestRate = annualInterestRate / 1200;
			double mountlyPayment = (loanAmount * montlyInterestRate)
					/ (1 - (1 / Math.pow(1 + montlyInterestRate, years * 12)));
			double totalPayment = mountlyPayment * years * 12;
			System.out.printf("%1.3f%1s", annualInterestRate , "%");
			System.out.printf("%17.2f", mountlyPayment);
			System.out.printf("%24.2f\n", totalPayment);
		}
	}

}
