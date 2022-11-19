package chapters.chapter_11.checkpoint;

import java.util.ArrayList;

public class CheckPoint_33 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        System.out.println(list); // displays [1, 3] because list.remove(1); statement discard the element '2'
    }
}
