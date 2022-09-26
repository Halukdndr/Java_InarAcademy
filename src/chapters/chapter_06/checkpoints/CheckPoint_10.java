package chapters.chapter_06.checkpoints;

public class CheckPoint_10 {
    public static void main(String[] args) {
        method(5,9.6);
    }
    public static double method(double i, double j) {
        while (i < j) {
            System.out.println(j);
            j--;
        }
        return j;
    }
}
