package chapters.chapter_11.exercises.E07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int val;
        do {
            System.out.println("Enter integers (0 ends)");
            val = input.nextInt();
            if (val != 0) {
                list.add(val);
            }
            }while (val != 0);
        System.out.println(list);
        shuffle(list);
        System.out.println(list.toString());
    }
    public static void shuffle(ArrayList<Integer> list){
        for (int i = list.size() - 1; i >= 0 ; i--) {
            int index = (int) (Math.random() * i);
            int temp = list.remove(i);
            list.add(index,temp);
        }
    }
}
