package chapters.chapter_02.exercises;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		//Convert pounds into kilograms
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value in pounds: ");
		
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms ");

	}

}
