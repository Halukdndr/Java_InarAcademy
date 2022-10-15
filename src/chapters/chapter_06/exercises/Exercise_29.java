package chapters.chapter_06.exercises;

public class Exercise_29 {
    public static void main(String[] args) {
        int num = 2;
        while (num < 1000){
            if (isTwinPrimes(num)){
                printTwinPrimes(num);
            }
            num++;
        }
    }

    private static void printTwinPrimes(int num) {
        System.out.println("(" + num + ", " + (num + 2) + ")");
    }

    public static boolean isTwinPrimes(int primeNum){
        if(isPrime(primeNum) && isPrime(primeNum + 2)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isPrime(int num){
        for (int divisor = 2;divisor <= num / 2;divisor++){
            if (num % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
