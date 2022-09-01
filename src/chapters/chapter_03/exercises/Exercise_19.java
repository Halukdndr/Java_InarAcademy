package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the edges length of a triangle: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		 double perimeter = a + b + c;
		 
		 if (a + b > c && a + c > b && c + b > a) {
			 System.out.println("The perimeter of the triangle " + a + " " + b + " " + c + " is " + perimeter);
		 }else System.out.println("The input is invalid");
		
		
	}

}
