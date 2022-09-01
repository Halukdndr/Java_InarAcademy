package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year (e.g., 2012): ");
		System.out.println("Enter month (1-12): ");
		System.out.println("Enter the day of the month (1-31): ");

		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();

		if (month == 1 || month == 2) {
			month += 12;
			year -= 1;
		}

		int m = month;
		int q = day;
		int j = year / 100;
		int k = year % 100;
		int h;

		h = (int) ((m + 1) * 26 / 10.0 + q + k + 5 * j + k / 4.0 + j / 4.0) % 7;

		switch (h) {
		case 0:System.out.println("Day of the week is Saturday");break;
		case 1:System.out.println("Day of the week is Sunday");break;
		case 2:System.out.println("Day of the week is Monday");break;
		case 3:System.out.println("Day of the week is Tuesday");break;
		case 4:System.out.println("Day of the week is Wednesday");break;
		case 5:System.out.println("Day of the week is Thursday");break;
		case 6:System.out.println("Day of the week is Friday");break;
		}

	}

}
