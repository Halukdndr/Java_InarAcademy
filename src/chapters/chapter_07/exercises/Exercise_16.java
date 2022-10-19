package chapters.chapter_07.exercises;

import java.util.Arrays;

public class Exercise_16 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 100_000;
        int[] arr = new int[ARRAY_LENGTH];
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * 100);
        }
        int keyNumber = (int)(Math.random() * 100);
        System.out.println(Arrays.toString(arr));
        linearSearch(arr,keyNumber);
        binarySearch(arr,keyNumber);

    }
    public static void linearSearch(int[] array,int key){
        long startTime = System.currentTimeMillis();
        array = sort(array);
        int index = -1;
        for (int i = 0;i < array.length;i++){
            if (array[i] == key){
                index = i;
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(key + " is in index of " + index);
        System.out.println("The linearSearch execution time is " + (endTime - startTime) + " milles");
    }
    public static void binarySearch(int[] array,int key){
        long startTime = System.currentTimeMillis();
        array = sort(array);
        int low = 0;
        int high = array.length - 1;
        int index = -1;
            while (high >= low){
                int mid = (high - low) / 2 + low;
                if (array[mid] > key){
                    high = mid - 1;
                } else if (array[mid] < key) {
                    low = mid + 1;
                }else {
                    index = mid;
                    break;
                }
            }
        long endTime = System.currentTimeMillis();
        System.out.println(key + " is in index of " + index);
        System.out.println("The binarySearch execution time is " + (endTime - startTime) + " milles");



    }
    public static int[] sort(int[] arr){
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = i + 1;j < arr.length;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
