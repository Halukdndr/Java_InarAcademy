package chapters.chapter_02;

import java.util.Scanner;

public class CheckPoint_17 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter an integer for m: " );
			
			double m = input.nextDouble();
			
			System.out.println("Enter an integer for r: " );
			
			double r = input.nextDouble();
			
			double result = m * Math.pow(r, 2);
			
			System.out.println("The result of mr2 is " + result );
		}
	}

}
