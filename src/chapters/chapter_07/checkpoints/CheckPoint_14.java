package chapters.chapter_07.checkpoints;

import java.util.Arrays;

public class CheckPoint_14 {
    public static void main(String[] args) {
        int[] myList;
        myList = new int[10];
        System.out.println(Arrays.toString(myList));
        System.out.println(myList);

        myList = new int[20];
        System.out.println(Arrays.toString(myList));
        System.out.println(myList); // YES it resizes the myList array but first myList
                                    // and second myList have different id
                                    // allocated 2 different space in heap memory
    }
}
