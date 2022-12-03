package chapters.chapter_13.exercises.E02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Exercise_02 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(95.45);
        numbers.add(new BigInteger("1542664223541226987443"));
        numbers.add(new BigDecimal("2.4585485554522556636987877581233655878"));
        displayArrayList(numbers);
        System.out.println();
        shuffle(numbers);
        displayArrayList(numbers);

    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int index = (int) (Math.random() * i);
            swap(list, i, index);
        }
    }

    private static void swap(ArrayList<Number> list, int i, int index) {
        Number temp = list.remove(i);
        Number temp2 = list.remove(index);
        list.add(index, temp);
        list.add(i, temp2);
    }

    public static void displayArrayList(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
