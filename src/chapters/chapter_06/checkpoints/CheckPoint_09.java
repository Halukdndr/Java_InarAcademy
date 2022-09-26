package chapters.chapter_06.checkpoints;

public class CheckPoint_09 {
    public static void main(String[] args) {
        System.out.println(method1(5, 4));
        System.out.println(method2(3.4));
    }

    public static int method1(int n, int m) {
        n += m;
        return n;
    }

    public static double method2(double n) {
        if (n > 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}

