package chapters.chapter_10.exercises;

public class Exercise_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        time1.display();
        System.out.println("------");
        time2.display();
    }
}
