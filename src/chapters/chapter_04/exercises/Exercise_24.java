package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first city:");
		String city1 = input.next();
		System.out.println("Enter the second city:");
		String city2 = input.next();
		System.out.println("Enter the third city:");
		String city3 = input.next();
		String temp = "";
		if  (city1.compareToIgnoreCase(city2) > 0 ){
			temp = city1;
			city1 = city2;
			city2 = temp;
		}
		if (city1.compareToIgnoreCase(city3) > 0) {
			temp = city1;
			city1 = city3;
			city3 = temp;
		}

		if (city2.compareToIgnoreCase(city3) > 0) {
			temp = city2;
			city2 = city3;
			city3 = temp;
		}
		
		System.out.println("The three cities in alphabetical order are");
		System.out.println(city1 + " " + city2 + " " + city3);
		
		
		
		
	}

}
