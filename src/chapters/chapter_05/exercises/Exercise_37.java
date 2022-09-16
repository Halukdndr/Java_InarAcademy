package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value for convert to binary:");
		int dec = input.nextInt();
		int d ;
		String sum = "";
		
		while (dec / 2 != 0) {
			d = dec % 2;
			dec /= 2;
			sum += d;
		}
		sum += dec;

		for (int i = sum.length() - 1; i >= 0; i--) {
			String digit = sum.substring(i, i +1);
			System.out.print(digit);
		}
		

	}

}
