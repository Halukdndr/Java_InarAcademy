package chapters.chapter_02.exercises;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		// Calculate tips
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of subtotal: ");
		
		double subtotal = input.nextDouble();
		
		System.out.println("Enter the percentage of gratuity : ");
		
		double gratuityRate = input.nextDouble();
		
		double gratuity = (subtotal * gratuityRate) / 100.0;
		
		double total = gratuity + subtotal;
		
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}

}
