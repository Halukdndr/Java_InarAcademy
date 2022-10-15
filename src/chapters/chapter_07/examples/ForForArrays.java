package chapters.chapter_07.examples;

import java.util.Arrays;

public class ForForArrays {
    public static void main(String[] args) {
        double[] myList = new double[100];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
        for (double e : myList
        ) {
            System.out.println(e);
        }
        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }
        System.out.println(max + " and " + indexOfMax);
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println(total);
        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.println(city);

        int[] arr = new int[10];
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * 100);
        }
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = (int)(Math.random() * (i));
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp1 = arr[arr.length - 1];
        for (int i = arr.length - 1;i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp1;

        System.out.println(Arrays.toString(arr));
        int temp2 = arr[0];
        for (int i = 1; i < arr.length;i++){
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp2;
        System.out.println(Arrays.toString(arr));

    }
}
