
package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_44 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x = input.nextInt();

		for (int i = 15; i >= 0; i--){
			System.out.print((x >> i) & 1);
		}


	}

}
