package chapters.chapter_07.exercises;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of first array:");
        int length1 = input.nextInt();
        int[] list1 = new int[length1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter the length of second array:");
        int length2 = input.nextInt();
        int[] list2 = new int[length2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        System.out.println("Two list are " + (equals(list1,list2) ? "" : "not ") + "strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length == list2.length) {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}