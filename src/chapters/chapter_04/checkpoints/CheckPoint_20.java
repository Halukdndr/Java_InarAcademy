package chapters.chapter_04.checkpoints;

public class CheckPoint_20 {

	public static void main(String[] args) {
		String s1 = " Welcome ";
		String s2 = " welcome ";
		
		boolean b = s1.equals(s2);
		System.out.println(b);//false

		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		int x = (int)s1.compareTo(s2);
		System.out.println(x);//-32
		
		int x1 = s1.compareToIgnoreCase(s2);
		System.out.println(x1);//0
		
		boolean b1 = s1.startsWith("AAA");
		System.out.println(b1);//false
		
		boolean b2 = s1.endsWith("AAA");
		System.out.println(b2);//false
		
		int y = s1.length();
		System.out.println(y);//9
		
		char ch = s1.charAt(0);//" "
		System.out.println(ch);//W
		
		String s3 = s1.concat(s2);// s1 + s2
		System.out.println(s3);// Welcome  welcome 
		
		System.out.println(s1.substring(1));//Welcome 
		System.out.println(s1.substring(1, 4));//Wel
		
		String s4 = s1.toLowerCase();
		System.out.println(s4);//welcome
		
		
		String s5 = s1.toUpperCase();//WELCOME
		System.out.println(s5);
		
		String s6 = s1.trim();
		System.out.println(s6);//Welcome
	}

}
