package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_47 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = input.nextLine();
		if (isbn.length() < 12) {
			System.err.println(isbn + " is an invalid input");
		} else {

			int sum = 0;

			for (int i = 0; i < 11; i += 2) {
				char ch = isbn.charAt(i);
				int d = (int) (ch) - 48;
				sum += d;
			}
			for (int j = 1; j < 12; j += 2) {
				char ch1 = isbn.charAt(j);
				int d1 = (int) ch1 - 48;
				sum += 3 * d1;
			}
			int checkSum = 10 - (sum % 10);
			if (checkSum == 0) {
				System.out.println(isbn + "0");
			} else
				System.out.println(isbn + checkSum);
		}

	}
}
