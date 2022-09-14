package chapters.chapter_05.exercises;

public class Exercise_18 {

	public static void main(String[] args) {

		System.out.println("Pattern A     Pattern B       Pattern C     Pattern D");

		for (int i = 1; i < 7; i++) {
			for (int y = 1; y <= i; y++) {
				System.out.printf("%-2d", y);
			}
			for (int z = 7 - i; z >= 1; z--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 7 - i; k++) {
				System.out.printf("%-2d", k);
			}
			System.out.print("             ");
			for (int s = i; s >= 1; s--) {
				System.out.printf("%2d", s);
			}
			for (int d = 1; d <= i; d++) {
				System.out.print("  ");
			}
			for (int t = 1; t <= 7 - i; t++) {
				System.out.printf("%2d", t);
			}
			System.out.println();
		}

	}

}
