package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a SSN: ");
		String ssn = input.next();

		if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-' || ssn.length() != 11) {
			System.err.println(ssn + " is an invalid social security number");
			System.exit(0);
		}else System.out.println(ssn + " is a valid social security number");

	}

}
