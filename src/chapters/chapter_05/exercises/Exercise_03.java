package chapters.chapter_05.exercises;

public class Exercise_03 {

	public static void main(String[] args) {
		
		System.out.printf("%-12s%10s\n" , "Kilograms", "Pounds");
		for (int kg = 1; kg < 200; kg += 2) {
			System.out.printf("%-2d" ,kg);
			System.out.printf("%20.1f\n",(kg * 2.2));
		}
		

	}

}
