package chapters.chapter_01.exercises;

public class Exercise_10 {

	public static void main(String[] args) {
		
		double distance = 14 / 1.6;
		double seconds = 45 * 60 + 30;
		double hour = seconds / 360;
		
		double average = distance / hour;
		
		System.out.println("Average speed in miles is " + average);
		
	}

}
