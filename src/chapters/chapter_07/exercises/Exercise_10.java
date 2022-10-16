package chapters.chapter_07.exercises;

import java.util.Arrays;

public class Exercise_10 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Index of the smallest element is " + indexOfSmallestElement(numbers));
    }
    public static int indexOfSmallestElement(double[] array){
       int index = 0;
        for (int i = 0;i < array.length;i++){
            if (array[i] == min(array)){
                index = i;
            }
        }
        return index;
    }
    public static double min(double[] array){
        double min = array[0];
        for (int i = 1;i < array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
