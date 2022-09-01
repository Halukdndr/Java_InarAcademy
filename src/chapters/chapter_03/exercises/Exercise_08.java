package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 integer: ");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		int max = Math.max(Math.max(x, y), z);
		int min = Math.min(Math.min(x, y), z);
		int med = 0;
		
		if (x == y || x == z || y == z) {
			if (x == y) {
				if (x > z) {
					med = max;
				}else med = min;
			}else if (x == z) {
				if (x > y) {
					med = max;
				}else med = min;
			}else if (y > x) {
				med = max;
			}else med = min;
		}else if (x < y && x > z || x < z && x > y) {
			med = x;
			}else if (y < x && y > z || y > x && y < z) {
				med = y;
			}else med = z;
		
		System.out.println("The integers in non-decreasing order: " + min + " " + med + " " + max);
		
}
}