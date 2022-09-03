package chapters.chapter_04.checkpoints;

public class CheckPoint_19 {

	public static void main(String[] args) {

		String str = "Welcome";
		char ch = '1';
		System.out.println(1 + str + 1 + 1);//1Welcome11
		System.out.println(1 + str + (1 + 1));//1Welcome2
		System.out.println(1 + "Welcome" + ('\u0001' + 1));//1Welcome2
		System.out.println(1 + str + ch + 1);//1Welcome11
		
		
	}

}
