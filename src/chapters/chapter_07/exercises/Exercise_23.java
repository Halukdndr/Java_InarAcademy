package chapters.chapter_07.exercises;

import java.util.Arrays;

public class Exercise_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        lockers = openOrClosed(lockers);
        System.out.println(Arrays.toString(lockers));
        printOpenLockers(lockers);
    }

    public static boolean[] openOrClosed(boolean[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            for (int j = i; j < lockers.length; j += (i + 1)) {
                if (lockers[j] == false) {
                    lockers[j] = true;
                } else {
                    lockers[j] = false;
                }
            }
        }
        return lockers;
    }

    public static void printOpenLockers(boolean[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}