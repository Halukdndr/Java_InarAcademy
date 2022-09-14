package chapters.chapter_05.exercises;

public class Exercise_06 {

	public static void main(String[] args) {
		
		System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");

		for (int miles = 1, km = 20; miles < 11 && km < 66; miles++,km += 5) {
			System.out.printf("%-2d%16.3f\t|\t", miles, (miles * 1.609));
			System.out.printf("%2d%19.3f\n", km , (km / 1.609));
		}
	}

}
