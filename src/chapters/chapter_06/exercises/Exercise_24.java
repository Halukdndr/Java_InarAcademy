package chapters.chapter_06.exercises;

import chapters.chapter_06.examples.PrintCalendar;

public class Exercise_24 {
    public static void main(String[] args) {       // one day problem
        printCurrentDate();
        printCurrentTime();
    }

    public static void printCurrentDate() {
        long remainningDays = getTotalDayFrom1_1_1800();
        int i = 1800;
        while (remainningDays >= 365){
            if (isLeapYear(i)){
                remainningDays -= 366;
            }else{
                remainningDays -= 365;
            }
            i++;
        }
        long currentMonth = 0;
        long currentDay = 0;
        if(isLeapYear(i)){
            if(remainningDays <= 31){
                currentMonth = 1;
                currentDay = remainningDays;
            } else if (remainningDays <= 60) {
                currentMonth = 2;
                currentDay = remainningDays - 31;
            } else if (remainningDays <= 91) {
                currentMonth = 3;
                currentDay = remainningDays - 60;
            } else if (remainningDays <= 121) {
                currentMonth = 4;
                currentDay = remainningDays - 91;
            } else if (remainningDays <= 152) {
                currentMonth = 5;
                currentDay = remainningDays - 121;
            } else if (remainningDays <= 182) {
                currentMonth = 6;
                currentDay = remainningDays - 152;
            } else if (remainningDays <= 213) {
                currentMonth = 7;
                currentDay = remainningDays - 182;
            } else if (remainningDays <= 244) {
                currentMonth = 8;
                currentDay = remainningDays - 213;
            } else if (remainningDays <= 274) {
                currentMonth = 9;
                currentDay = remainningDays - 244;
            } else if (remainningDays <= 305) {
                currentMonth = 10;
                currentDay = remainningDays - 274;
            } else if (remainningDays <= 335) {
                currentMonth = 11;
                currentDay = remainningDays - 305;
            }else {
                currentMonth = 12;
                currentDay = remainningDays - 335;
            }
        }else {
            if(remainningDays <= 31){
                currentMonth = 1;
                currentDay = remainningDays;
            } else if (remainningDays <= 59) {
                currentMonth = 2;
                currentDay = remainningDays - 31;
            } else if (remainningDays <= 90) {
                currentMonth = 3;
                currentDay = remainningDays - 59;
            } else if (remainningDays <= 120) {
                currentMonth = 4;
                currentDay = remainningDays - 90;
            } else if (remainningDays <= 151) {
                currentMonth = 5;
                currentDay = remainningDays - 120;
            } else if (remainningDays <= 181) {
                currentMonth = 6;
                currentDay = remainningDays - 151;
            } else if (remainningDays <= 212) {
                currentMonth = 7;
                currentDay = remainningDays - 181;
            } else if (remainningDays <= 243) {
                currentMonth = 8;
                currentDay = remainningDays - 212;
            } else if (remainningDays <= 273) {
                currentMonth = 9;
                currentDay = remainningDays - 243;
            } else if (remainningDays <= 304) {
                currentMonth = 10;
                currentDay = remainningDays - 273;
            } else if (remainningDays <= 334) {
                currentMonth = 11;
                currentDay = remainningDays - 304;
            }else {
                currentMonth = 12;
                currentDay = remainningDays - 334;
            }
        }

        System.out.println("The current date is " + currentMonth + "_" + currentDay + "_" + i );

    }

    public static void printCurrentTime(){
        final int HOUR_DIFF_BETWEEN_GRENWICH_AND_ISTANBUL = 3;
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        long currentSeconds = totalSeconds % 60;
        long currentMinutes = totalMinutes % 60;
        long currentHours = totalHours % 24;

        System.out.println("The current time is " + (currentHours + HOUR_DIFF_BETWEEN_GRENWICH_AND_ISTANBUL) + "_" + currentMinutes + "_" + currentSeconds);
    }
    public static long getTotalDayFrom1_1_1800(){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        long totalDays = totalHours / 24;
        return totalDays + getTotalNumberOfDaysBetween1_1_1800To1_1_1970();
    }

    public static long getTotalNumberOfDaysBetween1_1_1800To1_1_1970() {
        int total = 1;
        for (int i = 1800; i < 1970; i++) {
            if (isLeapYear(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        return total;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}
