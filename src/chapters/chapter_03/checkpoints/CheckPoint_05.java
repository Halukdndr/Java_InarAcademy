package chapters.chapter_03.checkpoints;

import java.util.Scanner;

public class CheckPoint_05 {

	public static void main(String[] args) {
		
		double pay = 10000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your score: ");
		
		int score = input.nextInt();
		
		
		if (score > 90) {
		System.out.println("Congratulations! You got an intrest.Your new salary is " + (pay * 103 / 100) );	
		} else System.out.println("Your salary is unchanged!");

	}

}
