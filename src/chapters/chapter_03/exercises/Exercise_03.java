package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		// ax + by = e
		//cx + dy = f
				
			//	ed - bf                3.4x + 50.2y = 44.5
		//x =		ad - bc             2.1x + .55y = 5.9
		
			//y =	af - ec 
				//ad - bc
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		if (((a * d) - (b * c)) == 0 ) {
			System.out.println("The equation has no solution");
			System.exit(1);
		}
		
		
		int x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		int y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		if (((a * d) - (b * c)) != 0 ) {
			System.out.println("x is " + x + " and y is " + y);
		} 
		
		
		
		
		
	}

}
