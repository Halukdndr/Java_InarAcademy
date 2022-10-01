package chapters.chapter_06.examples;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        printPrime(50);
    }
    public static void printPrime(int numberOfPrimes){
        int countOfPrime = 0;
        int num = 2;
        while (countOfPrime < numberOfPrimes){
            if (isPrime(num)){
                countOfPrime++;
                if (countOfPrime % 10 == 0){
                    System.out.printf("%4d\n",num);
                }else{
                    System.out.printf("%4d",num);
                }
            }
            num++;
        }

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