package chapters.chapter_01.exercises;

public class Exercise_04 {

	public static void main(String[] args) {
		int a = 1;
		System.out.printf("%-6s%-6s%-6s\n" , "a", "a^2","a^3");
		System.out.printf("%-6d%-6d%-6d\n" , a++ , (int)Math.pow(a, 2) , (int)Math.pow(a, 3));
		System.out.printf("%-6d%-6d%-6d\n" , a++ , (int)Math.pow(a, 2) , (int)Math.pow(a, 3));
		System.out.printf("%-6d%-6d%-6d\n" , a++ , (int)Math.pow(a, 2) , (int)Math.pow(a, 3));
		System.out.printf("%-6d%-6d%-6d\n" , a++ , (int)Math.pow(a, 2) , (int)Math.pow(a, 3));
		System.out.printf("%-6d%-6d%-6d\n" , a++ , (int)Math.pow(a, 2) , (int)Math.pow(a, 3));
		System.out.printf("%-6d%-6d%-6d\n" , a++ , (int)Math.pow(a, 2) , (int)Math.pow(a, 3));
		System.out.printf("%-6d%-6d%-6d\n" , a++ , (int)Math.pow(a, 2) , (int)Math.pow(a, 3));
	}

}
