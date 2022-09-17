package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int comWin = 0;
		int userWin = 0;

		while (comWin + 3 != userWin && userWin + 3 != comWin) {
			int comNum = (int) (Math.random() * 3);
			System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor:");
			int userNum = input.nextInt();

			if (userNum > 2 || userNum < 0) {
				System.err.println("The input is invalid!");
			} else {

				if (comNum == 0 && userNum == 2 || comNum == 1 && userNum == 0 || comNum == 2 && userNum == 1) {
					comWin++;
					System.out.println("Computer won!");
					System.out.println("Computer: " + comWin + " You: " + userWin);
				} else if (userNum == 0 && comNum == 2 || userNum == 1 && comNum == 0 || userNum == 2 && comNum == 1) {
					userWin++;
					System.out.println("You won!");
					System.out.println("Computer: " + comWin + " You: " + userWin);
				} else {
					System.out.println("Deuce");
					System.out.println("Computer: " + comWin + " You: " + userWin);
				}
			}
		}

		if (comWin == userWin + 3) {
			System.err.println("Game over!Try your chance later");
		} else {
			System.err.println("Congrats!You have defeated the computer");
		}

	}
}