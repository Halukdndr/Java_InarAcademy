package chapters.chapter_01.exercises;

public class Exercise_13 {

	public static void main(String[] args) {
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 55.0;
		double e = 44.5;
		double f = 5.9;
		
		double x = (e * d - b * f) / (a * d - b *c);
		double y = (a * f - e * c) / (a * d - b *c);
		
		System.out.println("x: " + x + " y: " + y);
		

	}

}
