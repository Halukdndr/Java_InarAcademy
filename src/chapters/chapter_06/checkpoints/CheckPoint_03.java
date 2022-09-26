package chapters.chapter_06.checkpoints;

public class CheckPoint_03 {
    public static void main(String[] args) {

        System.out.println("The largest number is " + max(5,5));
        System.out.println("The largest number is " + max(10,7));
        System.out.println("The largest number is " + max(5,9));
    }
    public static int max(int num1,int num2){
        int result = 0;
        result = (num1 >= num2) ? num1 : num2;
        return result;
    }
}
