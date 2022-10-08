package chapters.chapter_06.exercises;

import chapters.chapter_06.examples.PrimeNumberMethod;

public class Exercise_10 {
    public static void main(String[] args) {
        int i = 2;
        int countOfPrimes = 0;
        while (i < 10_000) {
            if((PrimeNumberMethod.isPrime(i))){
                countOfPrimes++;
                if(countOfPrimes % 10 == 0){
                    System.out.println(i);
                }else {
                    System.out.print(i + " ");
                }
            }

            i++;
        }
    }
}
