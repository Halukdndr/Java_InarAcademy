package weeks.week_03;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a four digit number :  ");
		
		int number = input.nextInt();
		
		int x = number / 1000;
		int y = (number % 1000) / 100;
		int z = (number % 100) / 10;
		int t = (number % 10);
		
		System.out.println("The reversed version of number is " + t + z + y + x);
		
		
		System.out.println();

	}

}
