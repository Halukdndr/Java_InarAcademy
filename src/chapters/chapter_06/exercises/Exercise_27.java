package chapters.chapter_06.exercises;

public class Exercise_27 {
    public static void main(String[] args) {
        int emirpCount = 0;
        int num = 2;

        while (emirpCount < 100){
            if (isEmirp(num)){
                emirpCount++;
                printEmirpNumbers(num,emirpCount);
            }
            num++;
        }
    }
    public static boolean isEmirp(int num){
        if (isPrime(num) && !isPalindrome(num) && isPrime(getReversed(num))){
            return true;
        }else{
            return false;
        }
    }
    public static int getReversed(int num){
       int remainingNumber = num;
       String reversed = "";
        while (remainingNumber != 0){
           reversed += remainingNumber % 10;
           remainingNumber /= 10;
        }
        return Integer.parseInt(reversed);
    }
    public static boolean isPrime(int num){
        for (int divisor = 2;divisor <= num / 2;divisor++){
            if(num % divisor == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int num){
        if(getReversed(num) == num){
            return true;
        }
        return false;
    }
    public static void printEmirpNumbers(int num,int counter){
            if (counter % 10 == 0){
                System.out.println(num);
            }else {
                System.out.print(num + " ");
            }
    }
}
