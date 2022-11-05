package chapters.chapter_09.examples;
import java.util.Random;
public class Random1 {
    public static void main(String[] args) {

        Random a = new Random(3);
        for (int i = 0; i < 10; i++) {
            System.out.print(a.nextInt(1000) + " ");
        }

        System.out.println("\n------------------");

        Random b = new Random(3);
        for (int i = 0; i < 10; i++) {
            System.out.print(b.nextInt(1000) + " ");
        }
    }
}
