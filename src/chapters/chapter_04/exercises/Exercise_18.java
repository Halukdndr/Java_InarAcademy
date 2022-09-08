package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two chracters which represent major and status:");
		String str  = input.next();
		str = str.toUpperCase();
		char major = str.charAt(0);
		char status = str.charAt(1);
		if (status > '4' || status < '1') {
			System.err.println("The input is invalid");
			System.exit(0);
			
		}
		
		switch (major) {
		case 'M':System.out.println("Mathematics ");break;
		case 'C':System.out.println("Computer Science ");break;
		case 'I':System.out.println("Information Technology ");break;
		default:System.err.println("The input is invalid");
			System.exit(0);break;
		}
		
		switch (status) {
		case '1': System.out.println("Freshman");break;
		case '2':System.out.println("Sophomore");break;
		case '3':System.out.println("Junior");break;
		case '4':System.out.println("Senior");break;
		default: System.err.println("The input is invalid");
		}
		
		
		
	}

}
