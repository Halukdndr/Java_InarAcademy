package chapters.chapter_05.examples;

public class While {

	public static void main(String[] args) {
		int sum = 0;
		int i =1;
		while (i < 10) {
			sum += i;
			i++;
		}
		System.out.println("sum is " + sum);
		
		System.out.println("---------------------");
		
		int x = 0;
		while(x < 100) {
			System.out.println("Welcome to Java");
			x++;
		}
		
		
	}

}
