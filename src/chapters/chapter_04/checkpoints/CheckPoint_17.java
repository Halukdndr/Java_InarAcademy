package chapters.chapter_04.checkpoints;

public class CheckPoint_17 {
	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		String s1 = "fun is here";
		String s2 = "here";
		String s3 = s1 + s2; 
		System.out.println(s3);
		//String s3 = s1 - s2;incorrect
		System.out.println(s1 == s2);
		//System.out.println(s1 >= s2);incorrect
		System.out.println(s1.compareTo(s2));
		
		int i = s1.length();//11
		//char c = s1(0);incorrect
		char c = s1.charAt((s1.length()));//not in the range
		
		
		
	}
}
