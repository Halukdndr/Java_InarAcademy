package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int countPos = 0;
		int countNeg = 0;
		int sum = 0;
		System.out.println("Enter an integer, the input ends if it is 0:");
		int data = input.nextInt();
		sum += data;
		if (data == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(0);
		}
		while (data != 0) {
			data = input.nextInt();
			sum += data;
			if (data < 0) {
				countNeg++;
			} else
				countPos++;
		}
		
		System.out.println("The number of positives " + countPos);
		System.out.println("The number of negatives " + countNeg);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + (sum / (countNeg + countPos * 100 / 100.0)));
		
	}

}
