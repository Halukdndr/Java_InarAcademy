package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int number = input.nextInt();
		
		if (number % 5 == 0 && number % 6 == 0) {
			System.out.println("Is 10 divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
			}else System.out.println("Is 10 divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
		
		if (number % 5 == 0 || number % 6 == 0) {
			System.out.println("Is 10 divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
		}else System.out.println("Is 10 divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
		
		if (number % 5 == 0 ^ number % 6 == 0) {
			System.out.println("Is 10 divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
		}else System.out.println("Is 10 divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
	}

}
