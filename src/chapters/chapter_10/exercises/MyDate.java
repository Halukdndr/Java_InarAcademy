package chapters.chapter_10.exercises;

import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar greCal = new GregorianCalendar();
        greCal.setTimeInMillis(elapsedTime);
        this.year = greCal.get(GregorianCalendar.YEAR);
        this.month = greCal.get(GregorianCalendar.MONTH);
        this.day = greCal.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public void setDate(long elapsedTime){
        GregorianCalendar greCal = new GregorianCalendar();
        greCal.setTimeInMillis(elapsedTime);
        this.year = greCal.get(GregorianCalendar.YEAR);
        this.month = greCal.get(GregorianCalendar.MONTH);
        this.day = greCal.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
