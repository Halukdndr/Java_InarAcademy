package chapters.chapter_11.exercises.E09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Integer[][] arr = fillArray();
        System.out.println("The random array is ");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
       int rowMost1 = findTheRowMost1(arr);
       int colMost1 = findColMost1(arr);
        System.out.println("The largest row index: " + rowMost1);
        System.out.println("The largest column index: " + colMost1);


    }
    public static Integer[][] fillArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size n: ");
        int n = input.nextInt();
        Integer[][] arr = new Integer[n][n];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }
    public static int findTheRowMost1(Integer[][] arr){
        int index = 0;
        int countMax = 0;
        for (int row = 0; row < arr.length; row++) {
            int count = 0;
           ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr[row]));
           int listSize = list.size();
            for (int i = 0; i < listSize; i++) {
                if (list.contains(1)) {
                    count++;
                    list.remove(list.indexOf(1));
                }
            }
           if (count > countMax){
               countMax = count;
               index = row;
           }
        }
        return index;
    }
    public static int findColMost1(Integer[][] arr){
        int index = 0;
        int countMax = 0;
        for (int col = 0; col < arr[0].length; col++) {
            int count = 0;
            ArrayList<Integer> list = new ArrayList<>();

            for (int row = 0; row < arr.length; row++) {
                list.add(arr[row][col]);
            }
            int listSize = list.size();
            for (int i = 0; i < listSize; i++) {
                if (list.contains(1)) {
                    count++;
                    list.remove(list.indexOf(1));
                }
            }
            if (count > countMax){
                countMax = count;
                index = col;
            }
        }
        return index;
    }
}
