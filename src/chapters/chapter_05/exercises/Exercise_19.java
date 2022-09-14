package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 14 :");
		int limit = input.nextInt();
		int k = 0;
		for (int i = 1; i <= limit; i++) {
			for (int s = limit - i; s > 0 ; s--) {
				System.out.print("     ");
			}
			for (k = 1; k <= Math.pow(2, i - 1); k *= 2) {
				System.out.printf("%5d",k);
			}
			for (int t = k / 4; t > 0; t /= 2) {
				System.out.printf("%5d",t);
			}
			System.out.println();
		}

	}

}
