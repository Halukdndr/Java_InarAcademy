package chapters.chapter_02.checkpoints;

import java.util.Scanner;

public class CheckPoint_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter purchase amount: ");
		
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		
		System.out.println("Sales tax is $ " + (int)(tax * 100) / 100);
		
		 
		
		
				
	}

}
	