package chapters.chapter_05.checkpoint;

public class CheckPoint_13 {

	public static void main(String[] args) {
		
		long sum = 0;
		for (int i = 0; i <= 1000; i++)
		sum = sum + i;
		System.out.println(sum);
		
		System.out.println("---------------");
		
		long sum1 = 0;
		int i = 0;
		while (i <= 1000) {
			sum1 = sum1 + i;
			i++;
		}
		System.out.println(sum1);
		
		System.out.println("------------------------");
		
		long sum2 = 0;
		int a = 0;
		do {
			sum2 = sum2 + a;
			a++;
		}while (a <= 1000);
		System.out.println(sum2);

		
	}

}
