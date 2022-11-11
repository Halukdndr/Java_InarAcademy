package chapters.chapter_10.exercises;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static boolean isOdd(int value){
        return value % 2 != 0;
    }
    public static boolean isPrime(int value){
        for (int divisor = 2;divisor <= value / 2;divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isEven(){
        return this.value % 2 == 0;
    }
    public boolean isOdd(){
        return this.value % 2 != 0;
    }
    public boolean isPrime(){
        for (int divisor = 2;divisor <= this.value / 2;divisor++) {
            if (this.value % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger myInteger){
        return myInteger.isEven();
    }
    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd();
    }
    public static boolean isPrime(MyInteger myInteger){
        return myInteger.isPrime();
    }
    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger myInteger){
        return this.value == myInteger.value;
    }
    public static int parseInt(char[] value){
        int result = 0;
        for (int i = 0,j = value.length - 1;j >= 0 && i < value.length; i++,j--) {
            if(!Character.isDigit(value[j])) {
                System.out.println("All the characters in the array needs to be a numeric type!");
                System.exit(1);
            }
            result += (value[j] - '0') * Math.pow(10,i);
        }
        return result;
    }
    public static int parseInt(String value){
        return MyInteger.parseInt(value.toCharArray());
    }
}
