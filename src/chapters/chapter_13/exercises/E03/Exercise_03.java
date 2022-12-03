package chapters.chapter_13.exercises.E03;

import chapters.chapter_13.exercises.E02.Exercise_02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Exercise_03 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(95.45);
        numbers.add(new BigInteger("1542664223541226987443"));
        numbers.add(new BigDecimal("2.4585485554522556636987877581233655878"));
        Exercise_02.shuffle(numbers);
        Exercise_02.displayArrayList(numbers);
        sort(numbers);
        Exercise_02.displayArrayList(numbers);


    }
    public static boolean isSorted(ArrayList<Number> list){
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()){
                return false;
            }
        }
        return true;
    }
    public static void sort(ArrayList<Number> list){
        while (!isSorted(list)){
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()){
                    swap(list,(i + 1),i);
                }
            }
        }
    }
    public static void swap(ArrayList<Number> list, int biggerIndex, int smallerIndex) {
        Number temp1 = list.remove(biggerIndex);
        Number temp2 = list.remove(smallerIndex);
        list.add(smallerIndex, temp1);
        list.add(biggerIndex, temp2);
    }
}
