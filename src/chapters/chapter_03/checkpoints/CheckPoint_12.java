package chapters.chapter_03.checkpoints;

import java.util.Scanner;

public class CheckPoint_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int count = input.nextInt();
		boolean newLine;
		
		if (count % 10 == 0)
			newLine = true;
			else
			newLine = false;
		System.out.println(newLine);
	}

}
