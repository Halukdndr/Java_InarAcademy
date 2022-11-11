package chapters.chapter_09.exercises;
import java.util.Arrays;
public class Exercise_06 {
    public static void main(String[] args) {
        final int numberOfInteger = 100_000;
        int[] list = new int[numberOfInteger];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * numberOfInteger);
        }
        int indexOfWantedNumber = (int) (Math.random() * numberOfInteger);
        StopWatch sortingTime = new StopWatch();
        sortingTime.start();
        System.out.println("Start time: " + sortingTime.getStartTime() + " milles");
        Arrays.sort(list);
        sortingTime.stop();
        System.out.println("End time: " + sortingTime.getEndTime() + " milles");
        System.out.println("The execution time of sorting " + indexOfWantedNumber + " is " + sortingTime.getElapsedTime() + " milles");
    }
}
