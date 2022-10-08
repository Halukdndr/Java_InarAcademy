package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer and see the matrix:  ");
        int n = input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
       int count = 0;
        for (int i = 0; i < n * n; i++){
            count++;
            if (count % n == 0){
                System.out.println((int)(Math.random() * 2));
            }else {
                System.out.print((int)(Math.random() * 2) + " ");
            }
        }
    }
}
