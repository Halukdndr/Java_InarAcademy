package chapters.chapter_04.checkpoints;

public class CheckPoint_23 {

	public static void main(String[] args) {
		// a) there are 3 decimal integer but der are only 2 formater and one of them is invalid 
		// b) it gives missing format exception %f is bull shit
		// c) it gives illegal format exception because 2 is not a floating-point number
		
		System.out.printf("%5d%d", 1, 2, 3);
		System.out.printf("%5d%5s\n", 5, "adsd");
		System.out.printf("%5d%5s", 5, "adsd");
		System.out.printf("%5d %f", 5, 5.8);
		System.out.printf("%5d %f", 1, 2);
		System.out.printf("%5d %f", 5);
		
		
		
	}

}
