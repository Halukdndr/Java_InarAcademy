package chapters.chapter_13.examples;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah","Boston","Atlanta","Tampa"};
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));
        BigInteger[] hugeNumbers =  {new BigInteger("2323231092923992"),new BigInteger("432232323239292"),new BigInteger("54623239292")};
        Arrays.sort(hugeNumbers);
        System.out.println(Arrays.toString(hugeNumbers));
    }
}
