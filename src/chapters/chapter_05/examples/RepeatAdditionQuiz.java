package chapters.chapter_05.examples;

import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println(a + " + " + b + " =?");
		int answer = input.nextInt();
		
		int i = 0;
		while (a + b != answer && i < 2) {
			System.out.println("Incorrect");
			System.out.println(a + " + " + b + " =?");
			answer = input.nextInt();
			i++;
		}
		if (a + b == answer) {
			System.out.println("Correct");
		}else System.out.println("No more chance!");
		
		
		
	}

}
