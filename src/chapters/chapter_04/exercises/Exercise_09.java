package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		// Find the Unicode of a character
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		
		String str = input.next();
		if (str.length() > 1) {
			System.err.println("Enter just one character, Please!");
			System.exit(0);
		}
		
		char ch = str.charAt(0);
		
		int i = (int)ch;
		
		System.out.println("The Unicode for the character " + ch + " is " + i);
		
		
		
		
		

	}

}
