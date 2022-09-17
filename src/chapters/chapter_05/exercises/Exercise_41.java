package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		int max = 0;
		int count = 0;

		do {
			System.out.println("Enter an integer (0 ends the program");
			num = input.nextInt();
			if (num > max) {
				max = num;
				count = 1;
			} else if (num == max) {
				count++;
			}
		} while (num != 0);

		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);

	}

}
