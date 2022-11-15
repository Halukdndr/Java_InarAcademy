package chapters.chapter_10.exercises;

import java.math.BigInteger;

public class Exercise_21 {
    public static void main(String[] args) {
        String s = Long.MAX_VALUE + "";
        BigInteger n = new BigInteger(s);
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        int counter = 0;
        while (counter <= 10){
            if (n.remainder(five).equals(BigInteger.ZERO) || n.remainder(six).equals(BigInteger.ZERO)){
                System.out.println(n.toString());
                counter++;
            }
            n = n.add(BigInteger.ONE);
        }
    }
}
