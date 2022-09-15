package chapters.chapter_05.exercises;

public class Exercise_25 {

	public static void main(String[] args) {

		double approximatePI = 0;
		double approximatePIMoreAccurate = 0;
		double approximatePIMostAccurate = 0;

		for (int i = 1; i <= 10_000; i++) {
			approximatePI += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
		}
		System.out.println(approximatePI + " is approximate value of pi .");

		for (int i = 1; i <= 20_000; i++) {
			approximatePIMoreAccurate += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
		}
		System.out.println(approximatePIMoreAccurate + " is more accurate value of pi .");

		for (int i = 1; i <= 100_000; i++) {
			approximatePIMostAccurate += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
		}
		System.out.println(approximatePIMostAccurate + " is more more accurate value of pi .");
	}

}
