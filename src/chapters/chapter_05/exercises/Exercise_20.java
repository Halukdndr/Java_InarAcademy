package chapters.chapter_05.exercises;

public class Exercise_20 {

	public static void main(String[] args) {

		int count = 0;
		int d = 0;
		int num = 2;
		
		for (num = 2; num <= 1000; num++) {
			boolean isPrime = true;
			for (d = 2; d <= num / 2; d++) {
				if (num % d == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				count++;
				if(count % 8 == 0) {
					System.out.println(num);
				}else System.out.print(num + " ");
			}
		}
		System.out.println("There are " + count + " prime numbers between 2 and 1000.");
	}
}
