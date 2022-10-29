package chapters.chapter_08.exercises;

import java.util.Arrays;

public class Exercise_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        for (int row = 0; row < m.length; row++) {
            System.out.println(Arrays.toString(m[row]));
        }
    }
    public static void shuffle(int[][] m){
        for (int row = m.length - 1; row >= 0; row--) {
            int index = (int) (Math.random() * row);
            for (int col = 0; col < m[row].length; col++) {
                swap(m, row, index, col);
            }
        }
    }

    public static void swap(int[][] m, int row, int index, int col) {
        int temp = m[row][col];
        m[row][col] = m[index][col];
        m[index][col] = temp;
    }


}
