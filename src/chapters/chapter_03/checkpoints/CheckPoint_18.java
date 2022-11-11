package chapters.chapter_03.checkpoints;

public class CheckPoint_18 {

	public static void main(String[] args) {
		int x = 1;
		//(true) && (3 > 4) = false
		
		System.out.println(!(x > 0) && (x > 0));//false
		System.out.println((x > 0) || (x < 0));//true
		System.out.println((x != 0) || (x == 0));//true
		System.out.println((x >= 0) || (x < 0));//true
		System.out.println((x != 1) == !(x == 1));//true
	
	}

}
