package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten double values");
        double[] arr = new double[10];
        for (int i = 0;i < arr.length;i++){
            arr[i] = input.nextDouble();
        }
        System.out.println(average(arr));

    }
        public static int average(int[] array){
            int sum = 0;
            for (int i = 0; i < array.length;i++){
                sum += array[i];
            }
            return sum / array.length;
        }
        public static double average(double[] array){
            double sum = 0;
            for (int i = 0; i < array.length;i++){
                sum += array[i];
            }
            return sum / array.length;
        }

}
