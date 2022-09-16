package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your mountly saving amount:");
		double amount = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		System.out.println("Enter the number of months: ");
		int month = input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 1200; 
		double totalMoney = 0;
		
		for (int i = 1; i <= month; i++) {
			totalMoney = (totalMoney + amount) * (1 + monthlyInterestRate);
			System.out.printf("After the " + i + ". month, value in the account becomes %4.3f\n" , totalMoney);
		}
	}

}
