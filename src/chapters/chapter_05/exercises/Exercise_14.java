package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two positeve integer: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int d = Math.min(n1, n2);
		
		while (true) {
			if (n1 % d == 0 && n2 % d == 0) {
				break;
			}
			d--;
		}
		
		int gcd = d;
		System.out.println("The great divisor of " + n1 + " and " + n2 + " is " + gcd);
		

	}

}
