package chapters.chapter_11.exercises.E13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + 10 + " numbers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list);
        removeDuplicate(list);
        System.out.println(list);
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        int size = list.size();
        ArrayList<Integer> listWithOutDublicate = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (!listWithOutDublicate.contains(list.get(i))){
                listWithOutDublicate.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(listWithOutDublicate);
    }
}
