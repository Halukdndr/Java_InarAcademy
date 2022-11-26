package chapters.chapter_11.exercises.E11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + 5 + " numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list);
        sort(list);
        System.out.println(list);

    }
    public static void sort(ArrayList<Integer> list){
        java.util.Collections.sort(list);
    }
}
