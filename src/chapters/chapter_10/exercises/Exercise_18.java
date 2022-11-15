package chapters.chapter_10.exercises;

import java.math.BigInteger;
import java.util.Arrays;

public class Exercise_18 {
    //TODO it does not work
    public static void main(String[] args) {

        String s = Long.MAX_VALUE + "";
        BigInteger num = new BigInteger(s);
        int counter = 0;
        while (counter < 5){
            if (isPrime(num)){
                System.out.println(num);
                counter++;
            }
        }


    }
    public static boolean isPrime(BigInteger num) {
        int counter = 0;
        for (int i = 2; i <= Long.MAX_VALUE / 2; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }
        int[] primeDivisors = new int[counter];
        counter = 0;
        for (int i = 2; i <= Long.MAX_VALUE / 2; i++) {
            if (isPrime(i)) {
                primeDivisors[counter++] = i;
            }
        }
        for (int i = 0; i < primeDivisors.length; i++) {
            BigInteger d = new BigInteger(primeDivisors[i] + "");
            if (num.remainder(d).compareTo(BigInteger.ZERO) == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int num){
        for (int divisor = 2; divisor <= num / 2;divisor++){
            if(num % divisor == 0){
                return false;
            }
        }
        return true;
    }

}
