package chapters.chapter_09.exercises;

import java.math.BigInteger;

public class Exercise_17 {
    public static void main(String[] args) {
        BigInteger n = new BigInteger(getMaxNOfSquareNumberOfLong() + "");
        System.out.println(Long.MAX_VALUE);
        System.out.println("--------------------");
        int counter = 0;
        while (counter < 10){
            System.out.println(n.multiply(n));
            n = n.add(BigInteger.ONE);
            counter++;
        }
    }
    public static long getMaxNOfSquareNumberOfLong(){
        long n = (long) Math.sqrt(Integer.MAX_VALUE);
        while (Math.pow(n,2) < Long.MAX_VALUE){
            n++;
        }
        return n;
    }

}
