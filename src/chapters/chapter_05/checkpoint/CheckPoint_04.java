package chapters.chapter_05.checkpoint;

import java.util.Scanner;

public class CheckPoint_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// input = 2 =>  max is 2 number is 2 //no output
		int number, max;                       // input = 3 =>  max is 3 number is 3 //no output
		number = input.nextInt();			   // input = 4 =>  max is 4 number is 4  //no output
		max = number;							// input = 5 =>  max is 5 number is 5  //no output
		while (number != 0) {					// input = 0=>  max is 5 number is 0   <= output 
			number = input.nextInt();
			if (number > max)
				max = number;
		}
		System.out.println("max is " + max);
		System.out.println("number " + number);
	}
}