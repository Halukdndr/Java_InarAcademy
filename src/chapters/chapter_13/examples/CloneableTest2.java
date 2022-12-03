package chapters.chapter_13.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class CloneableTest2 {
    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.5);
        list1.add(2.5);
        list1.add(3.5);
        ArrayList<Double> list2 = (ArrayList<Double>) list1.clone();
        ArrayList<Double> list3 = list1;
        list2.add(4.5);
        list3.remove(1.5);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
    }
}
