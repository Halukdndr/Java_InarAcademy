package chapters.chapter_05.checkpoint;

import java.util.Scanner;

public class CheckPoint_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			int number, sum = 0, count;
			for (count = 0; count < 5; count++) {  // 2 3 4 5 0
				number = input.nextInt();
				sum += number;
			}
		System.out.println("sum is " + sum);    //14
		System.out.println("count is " + count); //5

	}

}
