package chapters.chapter_03.checkpoints;

public class CheckPoint_09 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		x = 2;
		y = 3;
		
		if (x > 2)
			if (y > 2) {
			z = x + y;
			System.out.println("z is " + z);
			}
			else
			System.out.println("z is " + x);
		// No responce!
		System.out.println("------------------------------");
		x = 3;
		y = 2;
		
		if (x > 2)
			if (y > 2) {
			z = x + y;
			System.out.println("z is " + z);
			}
			else
			System.out.println("z is " + x);
		
		System.out.println("-----------------------------");
		
		x = 3;
		y = 3;
		
		if (x > 2)
			if (y > 2) {
			z = x + y;
			System.out.println("z is " + z);
			}
			else
			System.out.println("x is " + x);
		

	}

}
