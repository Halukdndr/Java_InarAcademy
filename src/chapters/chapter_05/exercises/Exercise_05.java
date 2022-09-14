package chapters.chapter_05.exercises;

public class Exercise_05 {

	public static void main(String[] args) {

		System.out.println("Kilograms   Pounds    |     Pounds\t Kilograms");
		
		for (int kg = 1 , p = 20; kg < 200 && p < 516;kg += 2 ,p += 5 ) {
			System.out.printf("%-3d", kg);
			System.out.printf("%15.1f    |     ", (kg * 2.2));
			System.out.printf("%-3d%19.2f\n", p , (p / 2.2));
		}
		
		

	}

}
