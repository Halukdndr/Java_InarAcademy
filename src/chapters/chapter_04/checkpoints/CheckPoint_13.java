package chapters.chapter_04.checkpoints;

public class CheckPoint_13 {

	public static void main(String[] args) {

		char x = 'a';
		char y = 'c';
		System.out.println(++x);//b
		System.out.println(y++);//c
		System.out.println(x - y);//b -d == -2
	}

}
