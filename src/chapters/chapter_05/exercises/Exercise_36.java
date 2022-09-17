package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		String str = input.next();
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			char ch = str.charAt(i);
			int d = (int) ch - 48;
			sum += d * (i + 1);
		}
		if (sum % 11 == 10) {
			System.out.println("The ISBN-10 number is " + str + "X");
		} else
			System.out.println("The ISBN-10 number is " + str + "" + (sum % 11));
	}

}
