package weeks.week_01;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		String message = "Welcome to Java";
		String message1 = message.substring(0, 3) + message.substring(11);
		
		System.out.println(message1);
		
		System.out.println(message.indexOf('W'));//0
		System.out.println(message.indexOf('o'));//4
		System.out.println(message.indexOf('o' , 5));//9	
		System.out.println(message.indexOf("come"));//3
		System.out.println(message.indexOf("Java", 5));//11
		System.out.println(message.indexOf("java", 5));//-1
		
		System.out.println("-----------------------------------");
		
		System.out.println(message.lastIndexOf('W'));//0
		System.out.println(message.lastIndexOf('o'));//9
		System.out.println(message.lastIndexOf('o' , 5));//4
		System.out.println(message.lastIndexOf("come"));//3
		System.out.println(message.lastIndexOf("Java" , 5));//-1
		System.out.println(message.lastIndexOf("Java"));//11
		
		System.out.println("--------------------------------");
				
		String str5 = "Haluk DUNDAR";
		
		int k = str5.indexOf(' ');
		System.out.println("The name is " + str5.substring(0 , k));
		System.out.println("The lastname is " + str5.substring(k + 1 ));
		
		
		System.out.println("--------------------------------------");
		
		String str8 = "12345";
		
		int x = Integer.parseInt(str8);
		
		System.out.println(x);
		
		
		String str9 = "123.85";
		double y = Double.parseDouble(str9);
		System.out.println(y);
		
		String s = 1537 + "56";
		System.out.println(s);
	}
}