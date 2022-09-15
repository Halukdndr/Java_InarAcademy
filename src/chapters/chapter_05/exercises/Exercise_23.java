package chapters.chapter_05.exercises;

public class Exercise_23 {

	public static void main(String[] args) {

		double resultLeftToRight = 0;
		double resultRightToLeft = 0;
		int n = 50_000;
		
		for (int i = 1; i <= n; i++) {
			resultLeftToRight += (1.0 / i);
		}

		for (n = 50_000; n > 0; n--) {
			resultRightToLeft += (1.0 / n);
		}
		
		System.out.println( resultLeftToRight + " is the result of left to right computing");
		System.out.println( resultRightToLeft + " is the result of rigth to left computing");
	}

}
