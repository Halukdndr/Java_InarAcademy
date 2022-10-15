package chapters.chapter_07.checkpoints;

import java.util.Arrays;

public class CheckPoint_17 {
    public static void main(String[] args) {
        int number = 0;
        int[] numbers = new int[1];
        m(number, numbers);
        System.out.println("number is " + number
                + " and numbers[0] is " + numbers[0]);
        // number is 0 and numbers[0] is 3
        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        // 1 2 3 4 5
    }
    public static void reverse(int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 - i];
            list = newList;
        /*for (int i = 0;i < list.length;i++){
                list[i] = newList[i];
            }
        System.out.println(Arrays.toString(list));
*/
    }
    public static void m(int x, int[] y) {
        x = 3;
        y[0] = 3;
    }
}

