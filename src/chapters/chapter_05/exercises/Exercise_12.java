package chapters.chapter_05.exercises;

public class Exercise_12 {

	public static void main(String[] args) {

		int n = 0;
		while (true) {
			if (Math.pow(n, 2) > 12_000) {
				break;
			}
			n++;
		}
		n *= -1;
		System.out.println("The smallest integer for (n * n > 12_000) conditional is " + n);
	}

}
