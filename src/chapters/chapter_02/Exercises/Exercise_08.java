package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
		// Current time for your time zone
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the time zone offset to GMT: ");
		int timeOffset = input.nextInt();
		
		int hour = (int)(totalHours % 24);
		int minute = (int)(totalMinutes % 60);
		int second = (int)(totalSeconds % 60);
		
		System.out.println("The current time is " + (hour + timeOffset) + "." + minute + "." + second);
	}

}
