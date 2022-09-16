package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name:");
		String name = input.next();

		System.out.println("Enter number of hours worked in a week:");
		double hour = input.nextDouble();

		System.out.println("Enter hourly pay rate:");
		double payRate = input.nextDouble();

		System.out.println("Enter federal tax withholding rate:");
		double fedTaxRate = input.nextDouble();

		System.out.println("Enter state tax withholding rate:");
		double staTaxRate = input.nextDouble();

		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hour);
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Gross Pay: " + payRate * hour);
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding (" + fedTaxRate * 100 + "%): $" + fedTaxRate * payRate * hour);
		System.out.println("  State Withholding (" + staTaxRate * 100 + "%): $" + staTaxRate * payRate * hour);
		System.out.println("  Total deduction: $" + (fedTaxRate + staTaxRate) * payRate * hour);
		System.out.println("Net Pay: $" + (1 - fedTaxRate - staTaxRate) * payRate * hour);

	}

}
