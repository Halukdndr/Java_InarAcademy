package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");

		String str = input.next();
		int length = str.length();
		char ch = str.charAt(0);
		
		System.out.println("Your string is length is " + length + " and first character is " + ch);
		
		
		
	}

}
