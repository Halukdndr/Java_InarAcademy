package chapters.chapter_04.examples;

import java.util.Scanner;

public class OrderTwoCities {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter two cities: ");
		
		String city1 = input.next();
		String city2 = input.next();
		
		city1 = city1.toLowerCase();
		city2 = city2.toLowerCase();
		
		char ch1 = city1.charAt(0);
		char ch2 = city2.charAt(0);
		
		
		
		int num1 = (int)(ch1);
		int num2 = (int)(ch2);		
		//System.out.println(city1 + " " + city2);// Amasya Samsun
		//System.out.println(ch1 + " " + ch2);// A S
		//System.out.println(num1 + " " + num2);65 83
		
		boolean b = (num1 > num2) ? true : false;
		
		
		
		if (b) {
			System.out.println(city2 + " " + city1);
		}else System.out.println(city1 + " " + city2);
		
		
		
	}

}
