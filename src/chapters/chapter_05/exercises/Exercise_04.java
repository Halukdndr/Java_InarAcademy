package chapters.chapter_05.exercises;

public class Exercise_04 {

	public static void main(String[] args) {
		System.out.printf("%-12s%10s\n","Miles", "Kilometers");
		
		for (int miles = 1; miles < 11; miles++) {
			System.out.printf("%-2d", miles);
			System.out.printf("%20.1f\n", (miles * 1.609));
		}

	}

}
