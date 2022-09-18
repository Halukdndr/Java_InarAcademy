package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_46 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		String reversed = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.substring(i , i + 1);
		}

		System.out.println("The reversed string is " + reversed);
	}

}
