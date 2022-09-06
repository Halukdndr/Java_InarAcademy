package chapters.chapter_04.checkpoints;

import java.util.Scanner;

public class CheckPoint_21 {

	public static void main(String[] args) {
		
		// 13
		
		String set1 =
				"1   3   5   7  \n" +
				"9   11  13  15 \n" +
				"17  19  21  23 \n" +
				"25  27  29  31 ";
		
		String set2 =
				"2   3   6   7  \n" +
				"10  11  14  15 \n" +
				"18  19  22  23 \n" +
				"26  27  30  31 ";
		
		String set3 = 
				"4   5   6   7  \n" +
				"12  13  14  15 \n" +
				"20  21  22  23 \n"	+
				"28  29  30  31 ";
		
		String set4 =
				"8   9   10  11 \n" +
				"12  13  14  15 \n"	+
				"24  25  26  27 \n" +
				"28  29  30  31 ";
		
		String set5 =
				"16  17  18  19 \n" +
				"20  21  22  23 \n" +
				"24  25  26  27 \n" +
				"28  29  30  31 ";
		
		int day = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Is your birthday in set1? \n");
		System.out.println(set1 + "\n");
		System.out.println("Enter 0 for no , 1 for yes" );
		int ans1 = input.nextInt();
		if (ans1 != 0 && ans1 != 1) {
			System.err.println("The input is invalid");
			System.exit(0);
		}
		day += (ans1 == 0) ? 0 : 1;
		
		System.out.println("Is your birthday in set2? \n");
		System.out.println(set2 + "\n");
		System.out.println("Enter 0 for no , 1 for yes" );
		int ans2 = input.nextInt();
		if (ans2 != 0 && ans2 != 1) {
			System.err.println("The input is invalid");
			System.exit(0);
		}
		day += (ans2 == 0) ? 0 : 2;
		
		System.out.println("Is your birthday in set3? \n");
		System.out.println(set3 + "\n");
		System.out.println("Enter 0 for no , 1 for yes" );
		int ans3 = input.nextInt();
		if (ans3 != 0 && ans3 != 1) {
			System.err.println("The input is invalid");
			System.exit(0);
		}
		day += (ans3 == 0) ? 0 : 4;
		
		System.out.println("Is your birthday in set4? \n");
		System.out.println(set4 + "\n");
		System.out.println("Enter 0 for no , 1 for yes" );
		int ans4 = input.nextInt();
		if (ans4 != 0 && ans4 != 1) {
			System.err.println("The input is invalid");
			System.exit(0);
		}
		day += (ans4 == 0) ? 0 : 8;
		
		System.out.println("Is your birthday in set5? \n");
		System.out.println(set5 + "\n");
		System.out.println("Enter 0 for no , 1 for yes" );
		int ans5 = input.nextInt();
		if (ans5 != 0 && ans5 != 1) {
			System.err.println("The input is invalid");
			System.exit(0);
		}
		day += (ans5 == 0) ? 0 : 16;
		
		System.out.println("Your birthday is " + day + "!");
		
		
		
		
		
		
		
		
	}



	}


