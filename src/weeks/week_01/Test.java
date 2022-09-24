package weeks.week_01;

public class Test {

	public static void main(String[] args) {

		System.out.println(sum(1, 10));
	}

	public static int sum(int num1, int num2) {
		int result = 0;
		for (int i = num1; i <= num2; i++) {
			result += i;
		}
		return result;
	}
}
