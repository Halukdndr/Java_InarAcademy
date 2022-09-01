package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the exchange rate from dollars to RMB: ");
	double exchangeRate = input.nextDouble();
	
	System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
	int converter = input.nextInt();
     
	if (converter == 0) {
		System.out.println("Enter the dollar amount:");
		double dollars = input.nextDouble();
		double rmb = dollars * exchangeRate;
		System.out.println("$" + dollars + " is " + rmb + " yuan");
	}else if (converter == 1) {
		System.out.println("Enter the RMB amount:");
		double rmb = input.nextDouble();
		double dollars = rmb / exchangeRate;
		System.out.println(rmb + " yuan is $" + dollars);
		System.out.println();
	}else System.out.println("The input is invalid!");
	 System.exit(1);
	 
	 
	 
	 
	}

}
