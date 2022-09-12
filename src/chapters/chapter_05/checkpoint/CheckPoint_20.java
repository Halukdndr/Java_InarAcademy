package chapters.chapter_05.checkpoint;

public class CheckPoint_20 {

	public static void main(String[] args) { // i | j
		for (int i = 1; i < 5; i++) { // 1.1|1 | 0 | => 0
			int j = 0; // 2.1|2 | 0 | => 0
			while (j < i) { // 2.2|2 | 1 | => 1
				System.out.print(j + " "); // 3.1|3 | 0 | => 0
				j++; // 3.2|2 | 1 | => 1
			} // 3.3|3 | 2 | => 2
		} // 4.1|4 | 0 | => 0
			// 4.2|4 | 1 | => 1|
			// 4.3|4 | 2 | => 2
			// 4.4|4 | 3 | => 3
		System.out.println("------------------------------------");
		int i = 0; // i | j
		while (i < 5) { // 1.0| 0 | 0 => () ****
			for (int j = i; j > 1; j--) // 2.0| 1 | 1 => () ****
				System.out.print(j + " "); // 3.1| 2 | 2 => 2 ****
			System.out.println("****"); // 4.1.2| 3 | 3 2 => 3 2 ****
			i++; // 5.1.2.3| 4 | 4 3 2 => 4 3 2 ****
		}
		System.out.println("----------------------------");
		i = 5;
		while (i >= 1) { // on my notebook page 128
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "xxx");
				num *= 2;
			}
			System.out.println();
			i--;
		}
		
			System.out.println("--------------------------------");
		
		i = 1;
		do {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "G");				// on my notebook page 129
				num += 2;
			}
			System.out.println();
			i++;
		} while (i <= 5);

	}
}
