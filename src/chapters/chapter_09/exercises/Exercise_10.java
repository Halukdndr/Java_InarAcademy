package chapters.chapter_09.exercises;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients(a.b.c) of the quadratic equation ax2 + bx + c = 0 ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
    QuadraticEquation equation = new QuadraticEquation(a,b,c);

    if (equation.getRoot1() != 0 && equation.getRoot2() != 0){
        System.out.println("r1: " + equation.getRoot1());
        System.out.println("r2: " + equation.getRoot2());
    } else if (equation.getRoot1() != 0) {
        System.out.println("r: " + equation.getRoot1());
    }else {
        System.out.println("The equation has no roots.");
    }

    }
}
