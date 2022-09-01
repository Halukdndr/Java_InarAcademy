package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		int computer = (int)(Math.random() * 3);
	
		Scanner input = new Scanner(System.in);
		System.out.println("Scissor (0), Rock (1), Paper (2) :");
		
		int gambler = input.nextInt();
		
		if (gambler == 0 && computer == 0) {
			System.out.println("The computer is scissor. You are scissor too. It is a draw");
		}else if (gambler == 0 && computer == 1) {
			System.out.println("The computer is rock. You are scissor. You lost");
		}else if (gambler == 0 && computer == 2) {
			System.out.println("The computer is paper. You are scissor. You won");
		}else if (gambler == 1 && computer == 0) {
			System.out.println("The computer is scissor. You are rock. You won");
		}else if (gambler == 1 && computer == 1) {
			System.out.println("The computer is rock. You are rock too. It is a draw");
		}else if (gambler == 1 && computer == 2) {
			System.out.println("The computer is paper. You are rock. You lost");
		}else if (gambler == 2 && computer == 0) {
			System.out.println("The computer is scissor. You are paper. You lost");
		}else if (gambler == 2 && computer == 1) {
			System.out.println("The computer is rock. You are paper. You won");
		}else if (gambler == 2 && computer == 2) {
			System.out.println("The computer is paper. You are paper too. It is a draw");
		}else System.out.println("Wrong input");
		

	}

}
