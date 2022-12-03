package chapters.chapter_13.exercises.E04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalender {
    public static void main(String[] args) {
        if (args.length > 2){
            System.out.println("usage: PrintCalender mount year or PrintCalender mount or PrintCalender");
            System.exit(0);
        }

        if (args.length == 2) {
            Calendar calendar = new GregorianCalendar();
            calendar.set(Integer.parseInt(args[1]), Integer.parseInt(args[0]) - 1, 1);
            printMonth(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1);

        }else if (args.length == 1){
            Calendar calendar = new GregorianCalendar();
            calendar.set(calendar.get(Calendar.YEAR),Integer.parseInt(args[0]) - 1,Calendar.DAY_OF_MONTH);
            printMonth(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1);
        }else {
            Calendar calendar = new GregorianCalendar();
            printMonth(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1);
        }
    }
    public static void printMonth(int year, int month) {
        printMonthTitle(year,month);
        printMonthBody(year,month);

    }

    private static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthTitle(month) + " " + year);
        System.out.println("----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

    }
    private static String getMonthTitle(int month) {
        String monthTitle = "";
        switch (month){
            case 1:monthTitle = "Jannuary";break;
            case 2:monthTitle = "February";break;
            case 3:monthTitle = "March";break;
            case 4:monthTitle = "April";break;
            case 5:monthTitle = "May";break;
            case 6:monthTitle = "June";break;
            case 7:monthTitle = "July";break;
            case 8:monthTitle = "August";break;
            case 9:monthTitle = "September";break;
            case 10:monthTitle = "November";break;
            case 11:monthTitle = "October";break;
            case 12:monthTitle = "December";break;
        }
        return monthTitle;
    }

    public static void printMonthBody(int year,int month) {
        for (int i = getStartDay(year,month); i > 0; i--){
            System.out.printf("%4s"," ");
        }
        for(int i = 1; i <= 7 - getStartDay(year,month);i++){
            System.out.printf("%4d",i);
        }
        System.out.println();
        int count = 0;
        for (int i = 8 - getStartDay(year,month);i <= getNumberOfDaysInMonth(year,month);i++){
            count++;
            if (count % 7 == 0) {
                System.out.printf("%4d",i);
                System.out.println();
            }else {
                System.out.printf("%4d",i);
            }
        }

    }

    public static int getStartDay(int year,int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int startDay =  (getTotalNumberOfDays(year,month) + START_DAY_FOR_JAN_1_1800) % 7;
        return startDay;
    }

    public static int getTotalNumberOfDays(int year,int month) {
        int totalNumberOfDays = 0;
        for(int i = 1800; i < year; i++){
            totalNumberOfDays += isLeap(i) ? 366 : 365;
        }
        for (int i = 1; i < month;i++){
            totalNumberOfDays += getNumberOfDaysInMonth(year,i);
        }
        return totalNumberOfDays;
    }
    public static int getNumberOfDaysInMonth(int year,int month) {
        int numberOfDaysInMonth = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            numberOfDaysInMonth = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            numberOfDaysInMonth = 30;
        }else {
            numberOfDaysInMonth = isLeap(year) ? 29 : 28;
        }
        return numberOfDaysInMonth;

    }
    public static boolean isLeap(int year) {

        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
