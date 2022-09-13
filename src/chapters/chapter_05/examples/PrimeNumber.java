package chapters.chapter_05.examples;

public class PrimeNumber {

	public static void main(String[] args) {
	int count = 0;
	int num = 2;
	
	while (count < 50) {
		boolean isPrime = true;
		
		for (int divisor = 2; divisor <= num / 2  ; divisor++) {
			if (num % divisor == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			count++;
			System.out.println(count + ". prime number is " + num);
			
		}
		num++;
		
	}
	
	
	}

}
