package chapters.chapter_10.exercises;

import java.math.BigDecimal;

public class Exercise_16 {
    public static void main(String[] args) {
        String s = "1";
        for (int i = 0; i < 49; i++) {
            s += "0";
        }
        BigDecimal number = new BigDecimal(s);
        BigDecimal divisor1 = new BigDecimal(2);
        BigDecimal divisor2 = new BigDecimal(3);
        BigDecimal zero = new BigDecimal(0);
        BigDecimal one = new BigDecimal(1);

        int counter = 0;
        while (counter < 10){
            if (number.remainder(divisor1).compareTo(zero) == 0 || number.remainder(divisor2).compareTo(zero) == 0){
                System.out.println(number);
                counter++;
            }
           number = number.add(one);
        }

    }
}