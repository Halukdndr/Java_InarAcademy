package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = (int)(Math.random() * 100);
		int y = (int)(Math.random() * 100);
		
		System.out.println( x + " + " + y + " =  ?" );
		
		int answer = input.nextInt();
		
		if (answer == (x + y)) {
			System.out.println((x + y) + " " + (answer == (x + y)));
		}else System.out.println((answer == (x + y)) + " the correct answer is  " + (x + y)  );
		
	}

}
