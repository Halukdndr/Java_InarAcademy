package chapters.chapter_03.examples;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number = input.nextInt();
		
		if (number % 5 == 0) {
			System.out.println("High Five");
		}
		if (number % 2 == 0) {
			System.out.println("High Even");
		}
		
		
		

	}

}
