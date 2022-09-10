package weeks.week_05;

import java.util.Iterator;
import java.util.Scanner;

public class JustFameusChars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				result += ch;
			}
		}
		System.out.println(result);
		
	}

}
