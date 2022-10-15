package chapters.chapter_07.checkpoints;

import java.util.Arrays;

public class CheckPoint_13 {
    public static void main(String[] args) {
        int[] source = {3,4,5};
        int[] target = new int[5];
        System.arraycopy(source,1,target,2,2);
        System.out.println(Arrays.toString(target));
    }
}
