package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_38 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value for convert to octal:");
		int dec = input.nextInt();
		String sum = "";
		int d ;
		
		while (dec / 8 != 0) {
			d = dec % 8;
			dec /= 8;
			sum += d;
		}
		sum += dec;

		for (int i = sum.length() - 1; i >= 0; i--) {
			String digit = sum.substring(i, i + 1);
			System.out.print(digit);
		}
	}

}
