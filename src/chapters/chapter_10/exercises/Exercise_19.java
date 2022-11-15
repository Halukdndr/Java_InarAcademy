package chapters.chapter_10.exercises;

import java.math.BigInteger;

public class Exercise_19 {
    public static void main(String[] args) {

        BigInteger two = new BigInteger("2");
        int p = 2;
        System.out.printf("%-2s%10s","p","2^p - 1");
        while (p <= 4){
            if (Exercise_18.isPrime(two.pow(p).subtract(BigInteger.ONE))){
                System.out.println(p + "          " + two.pow(p).subtract(BigInteger.ONE));
            }
            p++;
        }
    }
}
