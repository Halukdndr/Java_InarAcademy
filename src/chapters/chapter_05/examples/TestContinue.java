package chapters.chapter_05.examples;

public class TestContinue {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		while (num < 20) {
			num++;
			if (num == 10) {
				continue;
			}
			sum += num;
		
		}
		System.out.println(sum);  // 200
		System.out.println(num); // 20

	}

}
