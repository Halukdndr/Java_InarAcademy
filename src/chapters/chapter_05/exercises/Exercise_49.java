package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_49 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		int countVowel = 0;
		int countConsonant = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = (int)ch;
			if (ascii == 65 || ascii == 69 || ascii == 73 || ascii == 79 || ascii == 85
			 || ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117) {
				countVowel++;
			}else if (65 < ascii && ascii < 91 || 97 < ascii && ascii < 123) {
				countConsonant++;
			}
		}
		
		System.out.println("The number of vowels is " + countVowel);
		System.out.println("The number of consonants is " + countConsonant);
		
	}

}
