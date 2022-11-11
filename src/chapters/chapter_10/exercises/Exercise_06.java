package chapters.chapter_10.exercises;

import chapters.chapter_10.examples.StackOfIntegers;

public class Exercise_06 {
    public static void main(String[] args) {
        int num = 2;
        StackOfIntegers stack = new StackOfIntegers();
        while (num < 120){
            if (MyInteger.isPrime(num)){
                stack.push(num);
            }
            num++;
        }
        while (stack.getSize() != 0){
            System.out.print(stack.pop() + ", ");
        }
    }
}
