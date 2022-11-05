package chapters.chapter_09.exercises;
import java.util.Date;
public class Exercise_03 {
    public static void main(String[] args) {
        Date date = new Date();
        int setter = 10_000;
        for (int i = 0; i < 8; i++) {
            date.setTime(setter);
            System.out.println(date.toString());
            setter *= 10;
        }
    }
}
