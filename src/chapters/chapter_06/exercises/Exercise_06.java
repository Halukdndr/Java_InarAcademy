package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++){
            for(int k = n - i;k > 0;k--){
                System.out.printf("%3s"," ");
            }
            for (int j = i; j >= 1; j--){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }
}
