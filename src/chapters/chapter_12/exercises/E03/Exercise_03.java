package chapters.chapter_12.exercises.E03;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_03 {
    static final int CAPACITY = 100;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        int index = -1;
        while (true){
            try {
                System.out.println("Enter the index of the element");
                index = input.nextInt();
                System.out.println(array[index]);
                break;
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Out of Bounds");
                input.nextLine();
            }
        }


    }
    public static int[] getArray(){
        int[] array = new int[Exercise_03.CAPACITY];
        for (int i = 0; i < Exercise_03.CAPACITY; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
