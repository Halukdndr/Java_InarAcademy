package chapters.chapter_03.checkpoints;

public class CheckPoint_30 {

	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		
		switch (x + 3) {
			case 6: y = 1;
			default: y += 1;//y becomes 2 because we dont use break in line just above.
			
			System.out.println(y);
			
			System.out.println("----------------------");
			
			if (x + 3 == 6) {
				y = 1;
			}else y += 1;
			System.out.println(y);
	}
	}
}
