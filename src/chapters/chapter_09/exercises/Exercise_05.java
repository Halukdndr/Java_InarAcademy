package chapters.chapter_09.exercises;
import java.util.GregorianCalendar;
public class Exercise_05 {
    public static void main(String[] args) {
        GregorianCalendar currentDate = new GregorianCalendar();
        System.out.println(GregorianCalendar.YEAR);
        System.out.println(currentDate.getTime());
        currentDate.setTimeInMillis(1234567898765L);
        System.out.println(currentDate.getTime());

    }

}
