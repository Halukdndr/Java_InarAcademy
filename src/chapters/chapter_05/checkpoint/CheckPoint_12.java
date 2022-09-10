package chapters.chapter_05.checkpoint;

public class CheckPoint_12 {

	public static void main(String[] args) {
		int a = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("I do love Java");// i have to declare a variable outside of the loop 
			a = 10;							//for use outside of the loop
		}
		
		System.out.println(a);

	}

}
