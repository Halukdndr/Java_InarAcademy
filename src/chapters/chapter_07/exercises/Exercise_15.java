package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(eliminateDuplicates(numbers)));
    }

    public static int[] eliminateDuplicates(int[] list) {
        int countNotDublicate = 0;
        for (int i = 0;i < list.length;i++){
            if(isNotDublicate(list,i)){
                list[countNotDublicate] = list[i];
                countNotDublicate++;
            }
        }
        int[] notDublicateList = new int[countNotDublicate];
        System.arraycopy(list,0,notDublicateList,0,countNotDublicate);
        return notDublicateList;
    }

    public static boolean isNotDublicate(int[] numbers,int index) {
        for (int i = 0;i < index;i++){
            if (numbers[i] == numbers[index]){
                return false;
            }
        }
        return true;
    }
}
