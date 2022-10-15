package chapters.chapter_06.exercises;

public class Exercise_26 {
    public static void main(String[] args) {

        int num = 2;
        int palindromicPrimeCount = 0;
        while (palindromicPrimeCount < 100){
            String numString = num + "";
            if (isPalindrome(numString) && isPrime(num)) {
                palindromicPrimeCount++;
                printPalindromicPrimes(num,palindromicPrimeCount);
            }
                num++;

            }

    }
    public static boolean isPalindrome(String str){
        for (int i = 0;i < str.length() / 2;i++){
                 if (str.charAt(i) != str.charAt(str.length() - i - 1)){
                    return false;
                }
        }
        return true;
    }
    public static boolean isPrime(int num){
        for (int divisor = 2;divisor <= num / 2;divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printPalindromicPrimes(int palindromicPrimes,int counter){
            if (counter % 10 == 0){
                System.out.println(palindromicPrimes);
            } else{
                System.out.print(palindromicPrimes + " ");
            }
        }
    }

