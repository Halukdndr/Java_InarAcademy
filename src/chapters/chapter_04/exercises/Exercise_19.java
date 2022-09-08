package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as string:");
		String str = input.next();
		if (str.length() != 9) {
			System.err.println("The input is invalid!");
			System.exit(0);
		}
		int d1 = (int)str.charAt(0) - 48;
		int d2 = (int)str.charAt(1) - 48;
		int d3 = (int)str.charAt(2) - 48;
		int d4 = (int)str.charAt(3) - 48;
		int d5 = (int)str.charAt(4) - 48;
		int d6 = (int)str.charAt(5) - 48;
		int d7 = (int)str.charAt(6) - 48;
		int d8 = (int)str.charAt(7) - 48;
		int d9 = (int)str.charAt(8) - 48;
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
	
		if (d10 == 10) {
			System.out.println("The ISBN number is " + str + "X");
		}else System.out.println("The ISBN number is " + str + "" + d10);
		
		
		
		
		
	}

}
