package chapters.chapter_04.checkpoints;

public class CheckPoint_24 {

	public static void main(String[] args) {
		
		System.out.printf("amount is %f %e\n", 32.32, 32.32);//amount is 32.3200000 3,23200000e+1 
		//System.out.printf("amount is %5.2%% %5.4e\n", 32.327, 32.32);//gives exception
		System.out.printf("%6b\n", (1 > 2));// false
		System.out.printf("%6s\n", "Java");//  Java
		System.out.printf("%-6b%s\n", (1 > 2), "Java");//false Java
		System.out.printf("%6b%-8s\n", (1 > 2), "Java");// falseJava

	}

}
