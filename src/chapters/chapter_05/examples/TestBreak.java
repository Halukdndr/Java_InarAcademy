package chapters.chapter_05.examples;

import java.util.Scanner;

public class TestBreak {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;

		while (num < 20) {
			sum += num;
			if (sum > 50) {
				break;
			}

			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
