package weeks.week_05;

import java.util.Scanner;

public class JustNotFameus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			
			if (ch != 'a' && ch != 'e' && ch != 'o' && ch != 'u' && ch != 'i') {
			result += ch;	
			}
		}

		System.out.println(result);
	}

}
