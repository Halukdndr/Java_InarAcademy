package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value: ");
		int decimal = input.nextInt();
		if (decimal > 15 || decimal < 0) {
			System.err.println("The input is invalid!");
			System.exit(0);
		}
		
	if (decimal < 10 ) {
		System.out.println("The hexidecimal value is " + decimal);
	}else System.out.println("The hexidecimal value is " + (char)(decimal + 55));
		
		
		

	}

}
