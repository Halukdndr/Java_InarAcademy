package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_51 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1 = input.nextLine();
		System.out.println("Enter second string:");
		String str2 = input.nextLine();
		
		String lcp = "";
		
		
		int lengthMin = Math.min(str1.length(), str2.length());
		
		for (int i = 0; i <= lengthMin; i++) {
			for (int j = i + 1; j <= lengthMin; j++) {
				if (str1.substring(i, j).equals(str2.substring(i, j))) {
					if (str1.substring(i, j).length() > lcp.length()) {
						lcp = str1.substring(i, j);
					}
				}
				
			}
		}
		
		System.out.println("The longest common prefix of these two strings is " + lcp);
		

	}

}
