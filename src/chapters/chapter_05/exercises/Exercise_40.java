package chapters.chapter_05.exercises;

public class Exercise_40 {

	public static void main(String[] args) {
		int countTails = 0;
		int countHeads = 0;
		for (int i = 0; i < 1_000_000; i++) {
			int coin = (int) (Math.random() * 2);
			
			if (coin == 0) {
				countTails++;
			}else{
				countHeads++;
			}
		}

		System.out.println("The number of tails: " + countTails);
		System.out.println("The number of heads: " + countHeads);
	}

}
