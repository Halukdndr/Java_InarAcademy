package chapters.chapter_06.exercises;

public class Exercise_28 {
    public static void main(String[] args) {
        int mersennableNum = 0;
        printTable();
        for (int p = 2;p <= 31;p++){
             mersennableNum = (int)(Math.pow(2,p) -1);
           if (isMersennePrime(mersennableNum)){
               System.out.printf("%-2d                  %-11d\n",p,mersennableNum);
           }
        }
    }
    public static boolean isMersennePrime(int num){
        if (isPrime(num)){
            return true;
        }else {
            return false;
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
    public static void printTable(){
        System.out.println("p                   2^p-1");
        System.out.println("------------------------------");

    }


}