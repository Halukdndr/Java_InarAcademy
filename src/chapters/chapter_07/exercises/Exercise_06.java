package chapters.chapter_07.exercises;

import java.util.Arrays;

public class Exercise_06 {
    public static void main(String[] args) {

        //i don't know how can i use prime array as a divisor

        int[] primes = new int[50];
        primes = getPrimeArray(primes);
        System.out.println(Arrays.toString(primes));
    }

    private static int[] getPrimeArray(int[] primes) {
        int countPrime = 0;
        for (int i = 0;i < primes.length;i++){
        int num = 2;
        while (countPrime < 50){
            if (isPrime(num)){
                primes[countPrime] = num;
                countPrime++;

            }
            num++;
        }
        }
        return primes;
    }

    public static boolean isPrime(int num){
        for (int divisor = 2; divisor <= Math.sqrt(num);divisor++){
            if(num % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
