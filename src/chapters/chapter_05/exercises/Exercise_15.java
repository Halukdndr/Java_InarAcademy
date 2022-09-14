package chapters.chapter_05.exercises;

public class Exercise_15 {

	public static void main(String[] args) {
		int count = 0; 
	for (int i = 33; i < 127; i++) {
		count++;
		char ch = (char)(i - 33 + '!');
		System.out.print(ch + " ");
		if (count % 10 == 0) {
			System.out.println(ch);
		}
	}

	}

}
