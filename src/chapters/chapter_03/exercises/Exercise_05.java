package chapters.chapter_03.exercises;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day(Sunday is 0, Monday is 1, …, and Saturday is 6): ");
		
		int today = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		
		int future = input.nextInt();
		
		future = (future + today) % 7;
		
		
		System.out.print("Today is ");
		switch(today){
		case 1 : System.out.print("Monday "); break;
		case 2 : System.out.print("Tuesday "); break;
	   	case 3 : System.out.print("Wednesday "); break;
	    case 4 : System.out.print("Thursday "); break;
	    case 5 : System.out.print("Friday "); break;
		case 6 : System.out.print("Saturday "); break;
		case 0 : System.out.print("Sunday "); break;
		default : System.out.println("Invalid day"); System.exit(1);
		}
		
		System.out.print("and the future day is ");
		switch  (future){
                case 1 : System.out.println("Monday "); break;
                case 2 : System.out.println("Tuesday "); break;
                case 3 : System.out.println("Wednesday "); break;
                case 4 : System.out.println("Thursday "); break;
                case 5 : System.out.println("Friday "); break;
                case 6 : System.out.println("Saturday "); break;
                case 0 : System.out.println("Sunday "); break;
		}
		

	}

}
