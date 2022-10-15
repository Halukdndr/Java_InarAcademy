package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter millis: ");
        long milles = input.nextLong();
        System.out.println(convertMillis(milles));
    }
    public static String convertMillis(long millis){
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;

        String time = totalHours + ":" + minutes + ":" + seconds;
        return time;
    }
}

