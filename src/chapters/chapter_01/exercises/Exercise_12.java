package chapters.chapter_01.exercises;

public class Exercise_12 {

	public static void main(String[] args) {
		double kilometers = 24 * 1.6;
		int seconds = 60 * 60 + 40 * 60 + 35;
		double hour = seconds / (60 * 60);
		System.out.println("Average speed is " + (kilometers / hour));

	}

}
