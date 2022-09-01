package chapters.chapter_03.exercises;

public class Exercise_30 {

	public static void main(String[] args) {
		long totalSeconds = System.currentTimeMillis() / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		
		long hour = (totalHours + 3) % 24;
		
		long minute = totalMinutes % 60;
		
		long second = totalSeconds % 60;
		
		if (hour >= 12 ) {
			System.out.println("The current time is: " + (hour % 12) + "pm."  + minute + "." + second);
		}else if (hour != 0) {
			System.out.println("The current time is: " + (hour % 12) + "am."  + minute + "." + second);
		}else System.out.println("The current time is: 12pm."  + minute + "." + second);
		

	}

}
