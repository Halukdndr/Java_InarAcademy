package chapters.chapter_05.checkpoint;

public class CheckPoint_24 {

	public static void main(String[] args) {

		int balance = 10; // we use break for terminate the loop
		while (true) {
			if (balance < 9)
				break;
			balance = balance - 9;
		}
		System.out.println("Balance is " + balance);// 1

		balance = 10;
		while (true) {				//continue makes the loop skip the following statements and direct the beginning of the loop 
			if (balance < 9)
				continue;
			balance = balance - 9;
		}
		//System.out.println("Balance is " + balance); //infinite loop 

	}

}
