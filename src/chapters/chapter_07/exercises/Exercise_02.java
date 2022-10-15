package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_INTEGERS = 10;
        int[] numbers = new int[NUMBER_OF_INTEGERS];
        System.out.println("Enter 10 integers: ");
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(getReversed(numbers)));
    }

    private static int[] getReversed(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0;i < numbers.length;i++){
            reversed[numbers.length - i - 1] = numbers[i];
        }
        return reversed;
    }
}
