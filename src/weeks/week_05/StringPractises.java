package weeks.week_05;

import java.util.Scanner;

public class StringPractises {

	public static void main(String[] args) {
		
		length();
		substring();
		equalsIgnoreCase();
		contains();
		trim();
		charAt();
		toLowerCase();
		toUpperCase();
		concat();
		compareTo();
		compareToIgnoreCase();
}
	
	public static void length(){
		String temp = "I love Inar Academy";
		
		int length = temp.length();
		System.out.println(length);
		
	}
	public static void substring(){
		String str = "I love Java";
		String str1 = str.substring(2,6);
		System.out.println(str1);
	}
	public static void equalsIgnoreCase(){
		String str = "haluk";
		String str1 = "Haluk";
		System.out.println(str.equalsIgnoreCase(str1));
	}
	public static void contains(){
		String str = "I love String";
		String str1 = "love";
		System.out.println(str.contains(str1));
	}
	public static void trim(){
		String str = " 	 Inar Academy   ";
		System.out.println(str.trim());
	}
	public static void charAt(){
		String str = "Liang";
		char ch = str.charAt(2);//a
		System.out.println(ch);
	}
	public static void toLowerCase(){
		String str = "INar";
		String str1 = str.toLowerCase();
		System.out.println(str1);
	}
	public static void toUpperCase(){
		String str = "inar";
		String str1 = str.toUpperCase();
		System.out.println(str1);
	}
	public static void concat(){
		String name = "HAluk";
		String surname = "Dundar";
		String man = name.concat(surname);
		System.out.println(man);
	}
	public static void split(){
		String name = "HAluk";
		String surname = "Dundar";
		String man = name.concat(surname);
		
	}
	public static void compareTo(){
		String name = "HAluk";
		String surname = "Dunadar";
		System.out.println(name.compareTo(surname));
	}
	public static void compareToIgnoreCase(){
		String name = "haluk";
		String name1 = "haLuk";
		System.out.println(name.compareToIgnoreCase(name1));
		
	}
	
}