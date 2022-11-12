package chapters.chapter_10.exercises;

public class Exercise_14 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(561555550000L);
        System.out.println(date1.getYear() + ":" + date1.getMonth() + ":" + date1.getDay());
        System.out.println(date2.getYear() + ":" + date2.getMonth() + ":" + date2.getDay());
    }
}
