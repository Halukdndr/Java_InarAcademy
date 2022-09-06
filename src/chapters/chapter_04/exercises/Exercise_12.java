package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		// Hex to binary
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hexidecimal character: ");
		
		String hexi = input.next();
		if (hexi.length() > 1) {
			System.err.println("The input is invalid!");
			System.exit(0);
		}
		int deci = 0;
		char ch = hexi.charAt(0);
		
		if (ch > 'F') {
			System.err.println("The input is invalid!");
			System.exit(0);
		}
		
		
	System.out.println(ch);
		if ('A' <= ch && ch <= 'F' ) {
			deci = ch - 'A' + 10;
		}else  {
			deci = ch;
		}
		
		int b1 = deci % 2;
		deci /= 2;
		int b2 = deci % 2;
		deci /= 2;
		int b3 = deci % 2;
		deci /= 2;
		int b4 = deci % 2;
		
		
		System.out.println("The binary value is " + b4 + "" + b3 + "" + b2 + "" + b1);
		
		
		
		
		

	}

}
