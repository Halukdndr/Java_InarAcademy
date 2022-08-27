package chapters.chapter_03.checkpoints;

public class CheckPoint_08 {

	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		int z;

		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("z is " + x);
			// No responce!
		System.out.println("--------------");
		
		x = 3;
		y = 4;
		
		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("z is " + x);
		
		System.out.println("-----------------------");
		
		x = 2;
		y = 3;
		
		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("z is " + x);
	}

}
