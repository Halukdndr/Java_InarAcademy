package chapters.chapter_06.checkpoints;

public class CheckPoint_11 {
    public static void main(String[] args) {
        // yes. Arguments can have same name as their parameters.


        int num1 = 5;
        int num2 = 7;
    swap(num1,num2);

    }
    public static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1: " + num1 + " num2: " + num2);
    }
}
