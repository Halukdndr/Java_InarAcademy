package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		
	int i = input.nextInt();
	if (i <= 127 && i >= 0) {
	char ch = (char)i;
	System.out.println("The character for ASCII code " + i + " is " + ch);
	}else System.err.println("The input is invalid!");
		
		

	}

}
