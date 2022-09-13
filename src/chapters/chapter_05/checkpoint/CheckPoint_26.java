package chapters.chapter_05.checkpoint;

public class CheckPoint_26 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		
		while (number < 20 && sum <= 100) { // we don't depend on break :)
			number++;
			sum += number;
		}
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
		
		
		System.out.println("----------------------------------");
		
		sum = 0;
		number = 0;
		
		while (number < 20 ) {
			if(number != 10 && number != 11) {
			sum += number;}
			number++;
		}
		
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}

}
