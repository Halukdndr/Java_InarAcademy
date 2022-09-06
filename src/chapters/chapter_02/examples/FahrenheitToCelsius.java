package chapters.chapter_02.examples;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// It converts fahrenheit to celsius
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in fahrenheit: ");
		
		double fahrenheit = input.nextInt();
		
		double celsius = ( 5.0 / 9 ) * ( fahrenheit- 32 );
		
		System.out.println( fahrenheit + " fahrenheit is " + celsius + " celsius ");
		

	}

}
