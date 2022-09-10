package weeks.week_05;

import java.util.Scanner;

public class xxxxx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String result = s.replace('a', 'X');
		
	
		result = result.replace('A', 'X');
		result = result.replace('e', 'X');
		result = result.replace('E', 'X');
		result = result.replace('i', 'X');
		result = result.replace('I', 'X');
		result = result.replace('o', 'X');
		result = result.replace('O', 'X');
		result = result.replace('u', 'X');
		result = result.replace('U', 'X');
		
		System.out.println("String is " + s);
		System.out.println("result is " + result);

	}

}
