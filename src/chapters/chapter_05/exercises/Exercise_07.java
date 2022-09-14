package chapters.chapter_05.exercises;

public class Exercise_07 {

	public static void main(String[] args) {
	
		double tuition = 10_000;
		double sumFirst10 = 0;
		double sumLast4 = 0;
		for (int year = 1; year < 15; year++) {
			tuition *= 1.05;
			System.out.println(year + ". year's tuition is $" + (int)(tuition * 1000) / 1000.0);

			if (year < 11) {
				sumFirst10 += tuition;
			}
			if (10 < year) {
				sumLast4 += tuition;
			}
			
		}
		System.out.println("The total cost of first ten years is $" + (int)(sumFirst10 * 1000) / 1000.0);
		System.out.println("The total cost of four years’ worth of tuition after the tenth year is $" + (int)(sumLast4 * 1000) / 1000.0);
		

	}

}
