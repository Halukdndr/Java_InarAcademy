package chapters.chapter_07.checkpoints;

import java.util.Arrays;

public class CheckPoint_26 {
    public static void main(String[] args) {
        // we can use all the primitive data types Correctly but for strings  all the numbers must have the same number of digits (use 0 for this)
        String[] list = {"ab", "04", "01", "10"};
        java.util.Arrays.sort(list);  //
        System.out.println(Arrays.toString(list));
        // No it's a method in java class and there exist an array in sort method
        // and our local method invokes it and use it's referance
    }
}
