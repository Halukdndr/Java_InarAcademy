package chapters.chapter_04.exercises;

public class Exercise_25 {

	public static void main(String[] args) {
		int i1 = (int)(Math.random() * 26 + 65);
		int i2 = (int)(Math.random() * 26 + 65);
		int i3 = (int)(Math.random() * 26 + 65);
		int i4 = (int)(Math.random() * 9000 + 1000);
		
		char ch1 = (char)i1;
		char ch2 = (char)i2;
		char ch3 = (char)i3;
		
		System.out.println("The vehicle plate number is " + ch1 + "" + ch2 + "" + ch3 + " " + i4);
		
		
		
	}

}
