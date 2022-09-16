package chapters.chapter_05.exercises;

public class Exercise_33 {

	public static void main(String[] args) {

		
		for (int num = 2; num < 10_000; num++) {
			int perfect = 0;
			for (int d = num / 2; d > 0; d--) {
				if (num % d == 0) {
					perfect += d;
				}
			}
			if (perfect == num) {
				System.out.println(num);
			}
		}

	}

}
