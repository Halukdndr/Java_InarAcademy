package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string s1: ");
		String s1 = input.next();
		System.out.println("Enter string s2:");
		String s2 = input.next();
		
		if (s1.length() > s2.length() && s1.indexOf(s2) >= 0) {
		 System.out.println(s2 + " is a substring of " + s1);
		}else if (s2.length() > s1.length() && s2.indexOf(s1) >= 0) {
			System.out.println(s1 + " is a substring of " + s2);
		}else if (s1.length() == s2.length() && s1.equals(s2)) {
			System.out.println(s1 + " and " + s2 + " are same strings");
		}else System.out.println(s2 + " is not a substring of " + s1);
			
			
		

	}

}
