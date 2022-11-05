package chapters.chapter_09.exercises;
import java.util.Random;
public class Exercise_04 {
    public static void main(String[] args) {
        Random ran = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(ran.nextInt(100) + " ");
        }
    }
}
