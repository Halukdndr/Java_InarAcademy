package chapters.chapter_03.examples;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a the year you are in: ");
		
		int year = input.nextInt();
		
		if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) {
			System.out.println("You are in a leap year!");
		}else System.out.println("You are in a normal year!");

	}

}
