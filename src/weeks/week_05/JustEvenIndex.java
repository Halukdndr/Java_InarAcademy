package weeks.week_05;

import java.util.Scanner;

public class JustEvenIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");

		String str = input.nextLine();
		String result = "";
		
		for (int i = 0; i < str.length(); i += 2) {
			char ch = str.charAt(i);
			result += ch;
		}
		System.out.println(result);
		
		
		
	}

}
