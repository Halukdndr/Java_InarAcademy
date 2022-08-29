package chapters.chapter_03.checkpoints;

import java.util.Scanner;

public class CheckPoint_20 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		double x = input.nextDouble();
		
		boolean result = Math.abs(x - 5) < 4.5;
		System.out.println(result);
		
		boolean result1 = Math.abs(x - 5) > 4.5;
		System.out.println(result1);
		
		

	}

}
