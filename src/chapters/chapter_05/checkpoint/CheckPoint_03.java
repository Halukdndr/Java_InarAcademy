package chapters.chapter_05.checkpoint;

public class CheckPoint_03 {

	public static void main(String[] args) {
		int i = 1;   //a)
		while (i < 10)
		if (i % 2 == 0)
		System.out.println(i);//infinite  --No output
		
		
		System.out.println("-------------------");

		int x = 1;    //b)
		while (x < 10)
		if (x % 2 == 0)
		System.out.println(x++);//infinite    -- No output
		
		
		System.out.println("---------------------");
		
		int y = 1;   //c)
		while (y < 10)
		if ((y++) % 2 == 0)
		System.out.println(y);  // 9 times   - 3 5 7 9 
		
	}

}
