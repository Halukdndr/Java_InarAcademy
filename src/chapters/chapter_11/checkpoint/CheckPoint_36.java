package chapters.chapter_11.checkpoint;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckPoint_36 {
    public static void main(String[] args) {
        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        System.out.println(java.util.Collections.max(Arrays.asList(array)));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list.remove(list.size() - 1));
    }
}
