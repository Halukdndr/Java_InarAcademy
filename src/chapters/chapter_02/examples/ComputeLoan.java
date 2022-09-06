package chapters.chapter_02.examples;

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		
		 // User's gonna enter annual interest rate,the loan amount and the number of years for which payments will be made.
		 // Compute and display monthly and total payment amounts
		  
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter the annual interest rate(ex.4.5%) : ");
		 double annualInterestRate = input.nextDouble();
		 double montlyInterestRate = annualInterestRate / 1200;
		 
		 System.out.println("Enter the number of years: ");
		 int years = input.nextInt();
		 
		 System.out.println("Enter the loan amount: ");
		 double loanAmount = input.nextDouble();
		 
		 double mountlyPayment = (loanAmount * montlyInterestRate) / (1 - (1 / Math.pow(1 + montlyInterestRate, years * 12)));
		 
		 double totalPayment = mountlyPayment * years * 12;
		 
		 System.out.println("the mountly payment is $ " + (int)(mountlyPayment * 100) / 100.0 + "and total payment is $ " + (int)(totalPayment * 100) / 100.0);
		 
		 
		

	}

}
