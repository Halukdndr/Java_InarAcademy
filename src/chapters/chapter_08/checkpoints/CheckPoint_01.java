package chapters.chapter_08.checkpoints;

import java.util.Arrays;

public class CheckPoint_01 {
    public static void main(String[] args) {
        int[][] arr ;       // declare a two dimensional array
        arr = new int[4][5];  // create a 2 dimensional array
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                arr[i][j] = (int)(Math.random() * 10); //assign a 2 dimensional array
            }
        }
        for (int i = 0;i < arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));  // print  a 2 dimensional array
        }
    }
}
