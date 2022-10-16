package chapters.chapter_07.checkpoints;

import java.util.Arrays;

public class CheckPoint_27 {
    public static void main(String[] args) {
        int[] arr = {9,8,5,3,2};
        System.out.println(Arrays.binarySearch(arr, 8));
            // to apply binary search to an array ,the array should be sorted in increasing order
    }
}
