package chapters.chapter_03.checkpoints;

import java.util.Scanner;

public class CheckPoint_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weigth and heigth: ");
		double weigth = input.nextDouble();
		int heigth = input.nextInt();
		
		boolean result = (weigth > 50) && (heigth > 60); 
		
		System.out.println(result);
	}

}
