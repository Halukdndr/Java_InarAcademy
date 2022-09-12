package chapters.chapter_05.checkpoint;

public class CheckPoint_16 {

	public static void main(String[] args) {
		// we can always convert while loop to a for loop and vice verse.

		int i = 1;
		int sum = 0;
		while (sum < 10000) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("--------------------------------");
		int result = 0;
		for (i = 1; result < 10000; i++) {
			result += i;
		}
		
		System.out.println(result);
	}

}
