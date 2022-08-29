package chapters.chapter_03.checkpoints;

import java.util.Scanner;

public class CheckPoint_34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What isyour age: ");
		int age = input.nextInt();
		int ticketPrice;
		
		ticketPrice = (age >= 16) ? 20 : 10;
			System.out.println(ticketPrice);
	}

}
