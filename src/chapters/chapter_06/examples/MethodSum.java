package chapters.chapter_06.examples;
public class MethodSum {
    public static void main(String[] args) {

        System.out.println(sum(1,10));
        System.out.println(sum(5,90));
        System.out.println(sum(20,37));
    }

    public static int sum(int num1, int num2) {
        int result = 0;
        for (int i = num1; i <= num2; i++) {
            result += i;
        }
            return result;
        }
    }


