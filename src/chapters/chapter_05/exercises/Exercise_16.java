package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an intiger");
		int num = input.nextInt();
		int d = 2;
		while (d <= num) {
			if (num % d == 0) {
				num /= d;
				System.out.print(d + ",");
				continue;
			}
			
			d++;
		}
	

	}

}
