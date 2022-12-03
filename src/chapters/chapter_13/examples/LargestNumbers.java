package chapters.chapter_13.examples;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(95.45);
        numbers.add(new BigInteger("1542664223541226987443"));
        numbers.add(new BigDecimal("2.4585485554522556636987877581233655878"));

        System.out.println("The largest number is " + getLargestNumber(numbers));

    }
    public static Number getLargestNumber(ArrayList<Number> list){
        if (list.size() == 0 || list == null){
            return null;
        }
        Number largest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() > largest.doubleValue()){
                largest = list.get(i);
            }
        }
        return largest;
    }
}
