package chapters.chapter_07.checkpoints;

import java.util.Arrays;

public class CheckPoint_15 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 4};
        for (int i = 0, j = list.length - 1; i < j; i++, j--) {// i must smaller than j
            // Swap list[i] with list[j]
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
