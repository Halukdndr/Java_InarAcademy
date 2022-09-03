package chapters.chapter_04.examples;

import java.util.Scanner;

public class OrderTwoCities_BetterOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 cities: ");
		
		String city1 = input.next();
		String city2 = input.next();
		
		int x = city1.compareToIgnoreCase(city2);
		
		if (x == 0) {
			System.out.println(city1 + " " + city2);
		}else if (x > 0) {
			System.out.println(city2 + " " + city1);
		}else System.out.println(city1 + " " + city2);
		
	}

}
