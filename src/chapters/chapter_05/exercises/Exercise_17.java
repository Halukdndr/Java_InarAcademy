package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 15 :");
		int limit = input.nextInt();
		for (int i = 1; i <= limit; i++) {

			for (int s = limit - i; s > 0; s--) {
				System.out.printf("%3s", "  ");
			}
			for (int j = i; j > 0; j--) {
				System.out.printf("%3d", j, " ");
			}

			for (int k = 2; k <= i; k++) {
				System.out.printf("%3d", k, " ");

			}
			System.out.println();
		}

		
	}

}
