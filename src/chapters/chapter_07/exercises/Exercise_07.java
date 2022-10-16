package chapters.chapter_07.exercises;

import java.util.Arrays;

public class Exercise_07 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = (int) (Math.random() * 10);
        }
        int[] counts = new int[10];
        for (int i = 0;i < numbers.length;i++){
            counts[numbers[i]]++;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(counts));
    }
}
