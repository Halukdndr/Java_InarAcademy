package chapters.chapter_05.checkpoint;

public class CheckPoint_25 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			if (i % 3 == 0)
				continue;
			sum += i; // sum = 3
		}

		System.out.println(sum);
		System.out.println("---------------------------");

		int x = 0, result = 0;
		while (x < 3) {  // i decreased the limit
			x++;
			if (x % 3 == 0)
				continue;
			result += x; // result is 3
			
		}

		System.out.println(result);
	}

}
