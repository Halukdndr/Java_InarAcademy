package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a three-digit integer: ");
		
		int number = input.nextInt();
		
		int d3 = number % 10;
		int d1 = number / 100;
		
		System.out.println("" + number + (d3 == d1 ? " is a palindrome " : " is not a palindrome"));
		
		
	}

}
