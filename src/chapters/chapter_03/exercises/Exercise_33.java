package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		double cheapRate1 = weight1 / price1;
		
		System.out.println("Enter weight and price for package 2:");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		double cheapRate2 = weight2 / price2;
		
		if (cheapRate2 > cheapRate1) {
			System.out.println("Package 2 has a better price.");
		}else if (cheapRate1 > cheapRate2) {
			System.out.println("Package 1 has a better price.");
		}else System.out.println("Two packages have the same price.");
		

	}

}
