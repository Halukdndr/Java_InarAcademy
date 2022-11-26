package chapters.chapter_11.exercises.E12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter " + 5 + " numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        System.out.println(list);
        System.out.println("The sum of the list is " + sum(list));
    }
    public static double sum(ArrayList<Double> list){
       double sum = 0;
        int size = list.size();
        for (int i = 0; i < size ;i++ ) {
            sum += list.get(i);
        }
        return sum;
    }
}
