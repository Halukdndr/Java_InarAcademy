package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String str = input.next();
		str = str.toUpperCase();
		char ch = str.charAt(0);
		int i = (int)ch;
		
		if (64 < i && i < 68) {
			System.out.println("The corresponding number is 2");
		}else if (67 < i &&  i < 71) {
			System.out.println("The corresponding number is 3");
		}else if (70 < i && i < 74) {
			System.out.println("The corresponding number is 4");
		}else if (73 < i && i < 77) {
			System.out.println("The corresponding number is 5");
		}else if (76 < i && i < 80) {
			System.out.println("The corresponding number is 6");
		}else if (79 < i && i < 84) {
			System.out.println("The corresponding number is 7");
		}else if (83 < i && i < 87) {
			System.out.println("The corresponding number is 8");
		}else if (86 < i && i < 91) {
			System.out.println("The corresponding number is 9");
		}else System.err.println("The input is invalid");
		
		
		
		
		

	}

}
