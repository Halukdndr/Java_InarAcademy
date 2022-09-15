package chapters.chapter_05.exercises;

public class Exercise_24 {

	public static void main(String[] args) {

		double result = 0;
		for (int i = 1; i < 98; i += 2) {
			result += i / (i + 2.0);
		}

		System.out.println(result);
	}

}
