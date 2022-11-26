package chapters.chapter_11.exercises.E14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = getFromUser(1);
        ArrayList<Integer> list2 = getFromUser(2);

        System.out.println("The combined list is " + union(list1,list2));
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }
    public static ArrayList<Integer> getFromUser(int no){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers for the list " + no);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5;i++){
            list.add(input.nextInt());
        }
        return list;
    }

}
