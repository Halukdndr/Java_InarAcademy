package chapters.chapter_05.examples;

public class FutureTuition {

	public static void main(String[] args) {
		
		double tuition = 10_000;
		int year = 0;
		while (tuition < 20_000) {
			tuition *= 1.07;
			year++;
		}
		System.out.println("After " + year + " later your tuition becomes doubled") ;
		System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
	}

}
