package chapters.chapter_01.exercises;

public class Exercise_07 {

	public static void main(String[] args) {
		
		double approximatePI1 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
		double approximatePI2 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
		double pi = Math.PI;
		System.out.println(approximatePI1 );
		System.out.println(approximatePI2 );
		System.out.println(pi);

	}

}
