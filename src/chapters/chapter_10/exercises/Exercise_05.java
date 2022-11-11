package chapters.chapter_10.exercises;

import chapters.chapter_10.examples.StackOfIntegers;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers();
        int limit = num / 2;
        for (int i = 2; i <= limit; i++) {
            if (new MyInteger(i).isPrime()){
                if (num % i == 0){
                    num /= i;
                    stack.push(i--);
                }
            }
        }
        limit = stack.getSize();
        for (int i = 0; i < limit; i++) {
            System.out.print(stack.pop() + ", ");
        }
    }
}
