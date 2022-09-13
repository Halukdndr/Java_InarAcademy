package chapters.chapter_05.examples;

import java.util.Scanner;

public class TheSmallestFactor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int factor = 2;
		
		while (factor <= num) {
			if (num % factor == 0) {
				break;
			}
			factor++;
		}
		System.out.println("The smallest factor is " + factor);
	}

}
