package chapters.chapter_05.checkpoint;

import java.util.Scanner;

public class CheckPoint06 {
	public static void main(String[] args) {

		int number, max;
		Scanner input = new Scanner(System.in);  //2 => max2 number2
		number = input.nextInt();				// 3 => max3 number3
		max = number;							// 4 => max4 number4
												// 5 => max5 number0 <= output
		do {
			number = input.nextInt();
			if (number > max)
				max = number;
		} while (number != 0);

		System.out.println("max is " + max);
		System.out.println("number " + number);
	}

}
