package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of balls and the number of slots ");
        int balls = input.nextInt();
        int numberOfSlot = input.nextInt();
        char[] path = new char[numberOfSlot - 1];
        int[] slots = new int[numberOfSlot];
        for (int i = 0; i < balls ; i++) {
            path = getRandomPath(numberOfSlot);
            System.out.println(Arrays.toString(path));
            slots = fillSlots(slots,path);
        }
        System.out.println(Arrays.toString(slots));

    }
    public static char[] getRandomPath(int slots){
        char[] path = new char[slots - 1];
        for (int i = 0;i < path.length;i++){
            if ((int)(Math.random() * 2) == 0){
                path[i] = 'L';
            }else {
                path[i] = 'R';
            }
        }
        return path;
    }
    public static int[] fillSlots(int[]slots,char[] path){
            int countRight = 0;
            for (int j = 0; j < path.length; j++) {
                if (path[j] == 'R'){
                    countRight++;
                }
            }
            slots[countRight]++;
            return slots;
        }
    }

