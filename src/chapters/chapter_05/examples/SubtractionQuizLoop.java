package chapters.chapter_05.examples;

import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long beginning = System.currentTimeMillis();
		int i = 0;
		int correct = 0;
		int incorrect = 0;
		String report = "";
		while (i < 5 ) {
			int a = (int)(Math.random() * 10);
			int b = (int)(Math.random() * 10);
			if (b > a) {
				int temp = a;
				a = b;
				b = temp;
			}
			System.out.println(a + " - " + b + " =?");
			int answer = input.nextInt();
			if (answer == a - b) {
				System.out.println(a + " - " + b + " = " + answer + " " + (answer == a - b));
				correct++;
			}else {
				System.out.println(a + " - " + b + " = " + answer + " " + (answer == a - b));
				incorrect++;
			}
			report += "\n " + a + " + " + " = " + answer + ((answer == a - b) ? " Correct" : " Wrong");
			i++;
			
		}
		long ending = System.currentTimeMillis();
		int timeSpent = (int)((ending - beginning) / 1000);
		System.out.println(report);
		System.out.println("You have " + correct + " correct answers and " + incorrect + " incorrect answers");
		System.out.println("You spent " + timeSpent + " seconds");
		

	}

}
