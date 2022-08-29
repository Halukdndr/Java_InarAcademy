package chapters.chapter_03.checkpoints;

import java.util.Scanner;

public class CheckPoint_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");

		double num = input.nextDouble();
		
		System.out.println(0 < num && num < 100);
		
		System.out.println((0 < num && num <100) || (num < 0));
		
		
	}

}
