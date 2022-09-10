package chapters.chapter_05.checkpoint;

public class CheckPoint_08 {

	public static void main(String[] args) {
		int sum = 0;					
		for (int i = 0; i < 10; ++i) {
			sum += i;
			}
		System.out.println(sum);  //45
		
		System.out.println("------------"); // no difff
		sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
			}
		System.out.println(sum);  //45

	}

}
