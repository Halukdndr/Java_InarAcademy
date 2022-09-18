package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String str = input.nextLine();
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = (int)ch;
			if (64 < ascii && ascii < 91) {
				count++;
			}
		}
		System.out.println("The number of uppercase letters is " + count);

	}

}
