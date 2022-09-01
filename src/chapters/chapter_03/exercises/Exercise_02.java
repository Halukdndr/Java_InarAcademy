package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		
		int x = (int)(Math.random() * 10);
		int y= (int)(Math.random() * 10);
		int z = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println( x + " + " + y + " + " + z + " = ? ");
		
		int answer = input.nextInt();
		
		if (answer == (x + y + z)) {
			System.out.println(answer == (x + y + z));
		}else System.out.println(answer == (x + y + z));
			
		
		
	}

}
