package weeks.week_05;

import java.util.Scanner;

public class isPalidrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = input.nextLine();
		boolean isPalidrome = true;
		for (int i = 0; i < str.length() / 2; i++) {
			char chB = str.toLowerCase().charAt(i);
			char chE = str.toLowerCase().charAt(str.length() - i - 1);
		 isPalidrome = chE == chB;
			
		}
		if (isPalidrome) {
			System.out.println("Palidrome");
		}else System.out.println("Not palidrome");

	}

}
