package chapters.chapter_07.exercises;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        int[] numbers = new int[10];
        int countDistinct = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

    }
}
