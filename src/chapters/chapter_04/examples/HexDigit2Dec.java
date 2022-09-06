package chapters.chapter_04.examples;

import java.util.Scanner;

public class HexDigit2Dec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hexidecimal character:");
		String hexDecimal = input.next();
		
		if (hexDecimal.length() != 1) {
			System.err.println("You must enter exacly one character!");
			System.exit(0);
			}
		
		char ch = hexDecimal.charAt(0);
		if (ch >= 'A' && ch <= 'F') {
			int decimal = ch - 'A' + 10;
			System.out.println("The decimal value for " + hexDecimal + " is " + decimal);
		}else {
			System.out.println("The decimal value for " + hexDecimal + " is " + ch);
		}
		
		
		
		
		
		
		
	}

}
