package chapters.chapter_05.examples;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("\t Multiplication Table");
		System.out.print("   ");
		for (int i = 1; i < 10; i++) {
			
			System.out.printf("%4d",i);
		}
		System.out.println("\n----------------------------------------");
		int result = 0;
		int i = 1;
		for (i = 1; i < 10; i++) {
			System.out.print(i + " |");	
			for (int j = 1; j < 10; j++) {
				result = i * j;
				System.out.printf("%4d", result);
			}
			System.out.println();// this statement is added to previous line but from println 
								//	other prints or printfs can't be added to this line 
		}
	}

}
