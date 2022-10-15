package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100: ");
        int[] numbers = new int[100];
        int num = -1;
        while (num != 0) {
            num = input.nextInt();
            if (100 >= num && num > 0) {
                numbers[num - 1]++;
            }
        }
        for (int i = 0;i < numbers.length;i++) {
            if (numbers[i] > 1) {
                System.out.println((i + 1) + " occurs " + numbers[i] + " times");
            } else if (numbers[i] > 0) {
                System.out.println((i + 1) + " occurs " + numbers[i] + " time");
            }
        }
    }
}
