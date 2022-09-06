package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_13 {
	public static void main(String[] args) {
		// Vowel or consonant?
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter:");
		char ch = input.next().charAt(0);
		
		int i = (int)(ch);
		
		if (65 <= i && i <= 90) {
			System.out.println(ch + " is a consonant");
		}else if (97 <= i && i <= 122) {
			System.out.println(ch + " a is a vowel");
		}else System.out.println("It's not a letter!");

		
		
		
	}

}
