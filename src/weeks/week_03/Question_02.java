package weeks.week_03;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 number for 3 different age of people: ");

		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		if (x < y) {
			if (x < z) {
				System.out.println("The youngest person's age is " + x);
			}else System.out.println("The youngest person's age is " + z);
		} else if (y < z) {
			System.out.println("The youngest person's age is " + y);
		} else 
			System.out.println("The youngest person's age is " + z);
		
		
		if (x > y) {
			if (x > z) {
				System.out.println("The oldest person's age is " + x);
			}else System.out.println("The oldest person's age is " + z);
		} else if (y > z) {
			System.out.println("The oldest person's age is " + y);
		} else
			System.out.println("The oldest person's age is " + z);


	}
}
