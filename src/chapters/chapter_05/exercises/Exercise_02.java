package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		long timeStart = System.currentTimeMillis();
		int countCor = 0;
		
		for (int i = 0; i < 10 ; i++) {
			int a = (int)(Math.random() * 15 + 1);
			int b = (int)(Math.random() * 15 + 1);
			System.out.println(a + " + " + b + " = ?");
			int answer = input.nextInt();
			if (answer == a + b) {
				countCor++;
			}
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println("The number of correct answer is " + countCor);		
		System.out.println("Test duration is " + (int)((timeEnd - timeStart) / 1000) + " seconds");

		
		
		

	}

}
