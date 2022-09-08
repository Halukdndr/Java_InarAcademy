package chapters.chapter_04.exercises;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter a month (Just first 3 letter is enough):");
		String month = input.next().substring(0, 3);
		
		String str = month.substring(0 , 1);
		str = str.toUpperCase();
		String str1 = month.substring(1, 3);
		str1 = str1.toLowerCase();
		month = str + str1;
		
		
		boolean leapYear = year % 4 == 0;  
		
		
		switch (month) {
		case "Jan":System.out.println(month + " " + year + " has 31 days");break;
		case "Feb":System.out.println(month + " " + year + (leapYear ? " has 29 days" : " has 28 days") );break;
		case "Mar":System.out.println(month + " " + year + " has 31 days");break;
		case "Apr":System.out.println(month + " " + year + " has 30 days");break;
		case "May":System.out.println(month + " " + year + " has 31 days");break;
		case "Jun":System.out.println(month + " " + year + " has 30 days");break;
		case "Jul":System.out.println(month + " " + year + " has 31 days");break;
		case "Aug":System.out.println(month + " " + year + " has 31 days");break;
		case "Sep":System.out.println(month + " " + year + " has 30 days");break;
		case "Nov":System.out.println(month + " " + year + " has 31 days");break;
		case "Oct":System.out.println(month + " " + year + " has 30 days");break;
		case "Dec":System.out.println(month + " " + year + " has 31 days");break;
		}
		

		}
		
		
		
	}


