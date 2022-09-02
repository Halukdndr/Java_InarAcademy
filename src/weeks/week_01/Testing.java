package weeks.week_01;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {

		System.out.println("\\t is a tab \b character");
		
		int j = 2 + 'a'; // (int)'a' is 97
		System.out.println("j is " + j); // j is 99
		System.out.println(j + " is the Unicode for character "
		+ (char)j); // 99 is the Unicode for character c
		System.out.println("Chapter " + '2');
	}
}