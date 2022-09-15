package chapters.chapter_05.exercises;

public class Exercise_26 {

	public static void main(String[] args) {

		double approximateE1 = 1;
		int t = 1;
		double k = 1;
		for (int i = 1; i <= 10_000; i++) {
			k = 1;
			for (t = i ; t > 0; t--) {
				k *= t;
			}
			approximateE1 += (1.0 / k);
		}
		System.out.println(approximateE1);
		
		double approximateE2 = 1;
		t = 1;
		k = 1;
		for (int i = 1; i <= 20_000; i++) {
			k = 1;
			for (t = i ; t > 0; t--) {
				k *= t;
			}
			approximateE2 += (1.0 / k);
		}
		System.out.println(approximateE2);
		
		
		double approximateE3 = 1;
		t = 1;
		k = 1;
		for (int i = 1; i <= 100_000; i++) {
			k = 1;
			for (t = i ; t > 0; t--) {
				k *= t;
			}
			approximateE3 += (1.0 / k);
		}
		System.out.println(approximateE3);
		

	}

}
