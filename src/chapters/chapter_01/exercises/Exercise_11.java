package chapters.chapter_01.exercises;

public class Exercise_11 {

	public static void main(String[] args) {
		
		int seconds = 365 * 24 * 60 * 60;
		
		int birth = seconds / 7 ;
		int death = seconds / 13;
		int immigrant = seconds / 45;
		
		int change = birth - death + immigrant;
		int currentPopulation = 312_032_486;
		
		System.out.println("1 year later: " + (currentPopulation += change) );
		System.out.println("2 year later: " + (currentPopulation += change) );
		System.out.println("3 year later: " + (currentPopulation += change) );
		System.out.println("4 year later: " + (currentPopulation += change) );
		System.out.println("5 year later: " + (currentPopulation += change) );
	}

}
