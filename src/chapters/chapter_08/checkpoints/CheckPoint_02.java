package chapters.chapter_08.checkpoints;

import java.util.Arrays;

public class CheckPoint_02 {
    public static void main(String[] args) {
        // yes
        int[][] arr = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[1];

        for (int i = 0;i < arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
