package chapters.chapter_02.exercises;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		//Convert Celsius to Fahrenheit
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in celsius: ");
		
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		System.out.println( celsius + " celsius equals " + fahrenheit + " Fahrenheit");

	}

}
