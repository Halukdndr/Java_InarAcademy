package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your package weight in pound: ");
		double weight = input.nextDouble();
		double cost = 0;
		if (weight <= 1) {
			cost = 3.5;
		}else if (weight <= 3) {
			cost = 5.5;
		}else if (weight <= 10) {
			cost = 8.5;
		}else if (weight <= 20) {
			cost = 10.5;
		}else if (weight <= 21) {
			cost = 3.5 + 10.5;
		}else if (weight <= 23) {
			cost = 5.5 + 10.5;
		}else if (weight <= 30) {
			cost = 8.5 + 10.5;
		}else if (weight <= 40) {
			cost = 2 * 10.5;
		}else if (weight <= 41) {
			cost = 2 * 10.5 + 3.5;
		}else if (weight <= 43) {
			cost = 2 * 10.5 + 5.5;
		}else if (weight <= 50) {
			cost = 2 * 10.5 + 8.5;
		}else System.out.println("the package cannot be shipped.");
		System.out.println("It costs " + cost + "$");
	}

}
