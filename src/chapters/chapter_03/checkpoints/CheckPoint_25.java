package chapters.chapter_03.checkpoints;

import java.util.Scanner;

public class CheckPoint_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		boolean result = (age > 13) && (age < 18);
		
		System.out.println("You are a teenager? " + result);
		

	}

}
