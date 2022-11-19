package chapters.chapter_11.checkpoint;

import java.util.ArrayList;

public class CheckPoint_30 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(45.4);
        list.add(0,7.4);
        System.out.println(list.size());
        list.remove(7.4);
        list.remove(list.size() - 1);
        System.out.println(list.contains(4.4));
        list.add(45.5);
        System.out.println(list.get(0));

    }
}
