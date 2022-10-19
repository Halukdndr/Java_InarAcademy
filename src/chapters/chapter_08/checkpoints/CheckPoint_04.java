package chapters.chapter_08.checkpoints;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckPoint_04 {
    public static void main(String[] args) {
       // int[][] r = new int[2]; // declared 2 dimensional array but tried to create single dimensional
        // int[] x = new int[]; // needs to fix size
        int[][] y = new int[3][];
        int[][] z = {{1, 2}};
        int[][] m = {{1, 2}, {2, 3}};
        int[][] n = {{1, 2}, {2, 3}, };
        print2DimensionalArray(y);  // null
                                    // null
                                    // null
        print2DimensionalArray(z);  // [1,2]
        print2DimensionalArray(m);  // [1,2]
                                    // [2,3]
        print2DimensionalArray(n);  // [1,2]
                                    // [2,3]
    }
    public static void print2DimensionalArray(int[][] arr){
        for (int i = 0; i < arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-------------");
    }
}
