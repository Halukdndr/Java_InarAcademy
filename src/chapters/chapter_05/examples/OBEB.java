package chapters.chapter_05.examples;

import java.util.Scanner;

public class OBEB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num1 = input.nextInt();
		
		System.out.println("Enter another integer");
		int num2 = input.nextInt();
		
		int obeb = 1;
		int divider = 1;
		
		while (divider <= num1 && divider <= num2) {
			if (num1 % divider == 0 && num2 % divider == 0) {
				obeb = divider;
			}
			divider++;
		}
		System.out.println("The obeb of " + num1 + " and " + num2 + " is " + obeb);
		
	}

}
