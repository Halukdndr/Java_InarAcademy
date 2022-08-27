package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		// Find the number of years
		
		Scanner input = new Scanner(System.in);
		
		long totalMinutes;
		long totalDays;
		int years;
		int days;
		System.out.println("Enter the number of minutes(e.g., 1 billion): ");
		
		totalMinutes = input.nextLong();
		
		totalDays = (totalMinutes / (60 * 24) );
	
		years = (int)totalDays / 365;
		
		days = (int)totalDays % 365;
		
		System.out.println(totalMinutes + " minutes is approximately " + years + " years and " + days +" days");
		

	}

}
