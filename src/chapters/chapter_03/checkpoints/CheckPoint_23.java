package chapters.chapter_03.checkpoints;

import java.util.Scanner;

public class CheckPoint_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		double x = input.nextDouble();
		
		boolean result = (x >= 50 && x <= 100);
		
		System.out.println(x + "is between 50 and 100 : " + result);
        //45 false
		//67 true
		//101 false
	}

}
