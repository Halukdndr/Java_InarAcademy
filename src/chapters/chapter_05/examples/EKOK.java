package chapters.chapter_05.examples;

import java.util.Scanner;

public class EKOK {

	public static void main(String[] args) {
		//My way(old fashioned)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number1");
		int num1 = input.nextInt();
		
		System.out.println("Enter number2");
		int num2 = input.nextInt();
		
		int divisor = 1;
		int GCD = 1;
		
		while (divisor <= num1 && divisor <= num2 ) {
			if (num1 % divisor == 0 && num2 % divisor == 0) {
				GCD = divisor;
			}
			divisor++;
		}
		
		int SF = num1 * num2 / GCD;
		System.out.println("The smallest factor of " + num1 + " and " + num2 + " is " + SF);
		
		
	}

}
