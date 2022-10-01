package chapters.chapter_06.checkpoints;

public class CheckPoint_12 {
    public static void main(String[] args) {
        nPrintln(5, "Welcome to Java!");
    }

    public static void nPrintln(int n, String message) {

        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}