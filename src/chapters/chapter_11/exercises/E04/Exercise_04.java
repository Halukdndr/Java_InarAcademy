package chapters.chapter_11.exercises.E04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int value = -1;
        while (value != 0){
            System.out.println("Enter numbers (to end press 0)");
             value = input.nextInt();
             if (value != 0) {
                 list.add(value);
             }
        }

        System.out.println(max(list));

    }

    public static Integer max(ArrayList<Integer> list){

        if (list.isEmpty() || list.size() == 0){
            return null;
        }
        return Collections.max(list);
    }

}
